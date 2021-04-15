// This file is auto-generated by Tabular v0.6.1, DO NOT EDIT!

#include "AutogenConfig.h"
#include <stddef.h>
#include <assert.h>
#include <memory>
#include <fstream>
#include "Utility/Conv.h"
#include "Utility/StringUtil.h"

using namespace std;

#ifndef ASSERT
#define ASSERT assert
#endif


namespace config {

// parse data object from an csv row
int SoldierPropertyDefine::ParseFromRow(const vector<StringPiece>& row, SoldierPropertyDefine* ptr)
{
    ASSERT(row.size() >= 23);
    ASSERT(ptr != nullptr);
    ptr->Name = parseTextAs<std::string>(row[0]);
    ptr->Level = parseTextAs<int>(row[1]);
    ptr->NameID = parseTextAs<std::string>(row[2]);
    ptr->Description = parseTextAs<std::string>(row[3]);
    ptr->BuildingName = parseTextAs<std::string>(row[4]);
    ptr->BuildingLevel = parseTextAs<uint32_t>(row[5]);
    ptr->RequireSpace = parseTextAs<uint32_t>(row[6]);
    ptr->UpgradeTime = parseTextAs<uint32_t>(row[7]);
    ptr->UpgradeMaterialID = parseTextAs<std::string>(row[8]);
    ptr->UpgradeMaterialNum = parseTextAs<int64_t>(row[9]);
    ptr->ConsumeMaterial = parseTextAs<std::string>(row[10]);
    ptr->ConsumeMaterialNum = parseTextAs<int>(row[11]);
    ptr->ConsumeTime = parseTextAs<int>(row[12]);
    ptr->Act = parseTextAs<int>(row[13]);
    ptr->Hp = parseTextAs<int>(row[14]);
    ptr->BombLoad = parseTextAs<int16_t>(row[15]);
    ptr->Duration = parseTextAs<float>(row[16]);
    ptr->TriggerInterval = parseTextAs<float>(row[17]);
    ptr->SearchScope = parseTextAs<int16_t>(row[18]);
    ptr->AtkFrequency = parseTextAs<float>(row[19]);
    ptr->AtkRange = parseTextAs<double>(row[20]);
    ptr->MovingSpeed = parseTextAs<double>(row[21]);
    ptr->EnableBurn = parseTextAs<bool>(row[22]);
    return 0;
}


} // namespace config 
