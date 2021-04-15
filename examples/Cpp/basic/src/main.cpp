#include <stdio.h>
#include <assert.h>
#include <type_traits>
#include <iostream>
#include <fstream>
#include "AutogenConfig.h"
#include "Utility/StringUtil.h"
#include "Utility/CSVReader.h"

#ifndef ASSERT
#define ASSERT assert
#endif


using namespace std;
using namespace config;

static std::string resPath = "../res";

static std::string readfile(const char* filepath)
{
    std::string filename = stringPrintf("%s/%s", resPath.c_str(), filepath);
    std::ifstream ifs(filename.c_str());
    std::string content((std::istreambuf_iterator<char>(ifs)),
        (std::istreambuf_iterator<char>()));
    //cout << (void*)content.data() << endl;
    //cout << content << endl;
    return std::move(content);
}

static void LoadConfig(vector<config::SoldierPropertyDefine>& data) 
{
    string content = readfile("soldier_property_define.csv");
    CSVReader reader(config::TABULAR_CSV_SEP, config::TABULAR_CSV_QUOTE);
    reader.Parse(content);
    auto rows = reader.GetRows();
    ASSERT(!rows.empty());
    for (size_t i = 0; i < rows.size(); i++)
    {
        auto row = rows[i];
        if (!row.empty())
        {
            config::SoldierPropertyDefine item;
            config::SoldierPropertyDefine::ParseFromRow(row, &item);
            data.push_back(item);
        }
    }
}

static void printSoldierProperty(const config::SoldierPropertyDefine& item) 
{
    cout << item.Name << " "
        << item.Level << " "
        << item.NameID << " "
        << item.Description << " "
        << item.BuildingName << " "
        << item.BuildingLevel << " "
        << item.RequireSpace << " "
        << item.UpgradeTime << " "
        << item.UpgradeMaterialID << " "
        << item.UpgradeMaterialNum << " "
        << item.ConsumeMaterial << " "
        << item.ConsumeMaterialNum << " "
        << item.ConsumeTime << " "
        << item.Act << " "
        << item.Hp << " "
        << item.BombLoad << " "
        << item.Duration << " "
        << item.TriggerInterval << " "
        << item.SearchScope << " "
        << item.AtkFrequency << " "
        << item.AtkRange << " "
        << item.MovingSpeed << " "
        << item.EnableBurn << " "
        << endl;
}

int main(int argc, char* argv[])
{
    if (argc > 1)
    {
        resPath = argv[1];
    }
    vector<config::SoldierPropertyDefine> data;
    LoadConfig(data);
    cout << stringPrintf("%d soldier config loaded.\n", (int)data.size());
    for (const SoldierPropertyDefine& item : data)
    {
        printSoldierProperty(item);
    }
    return 0;
}
