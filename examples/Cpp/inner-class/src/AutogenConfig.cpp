// This file is auto-generated by Tabular v0.6.12, DO NOT EDIT!

#include "AutogenConfig.h"
#include <stddef.h>
#include <assert.h>
#include <memory>
#include <fstream>
#include <absl/strings/str_split.h>

using namespace std;

#ifndef ASSERT
#define ASSERT assert
#endif


namespace config {

// parse data object from an csv row
int BoxProbabilityDefine::ParseFromRow(const CSVRow& row, BoxProbabilityDefine* ptr)
{
    ASSERT(row.size() >= 13);
    ASSERT(ptr != nullptr);
    ptr->ID = parseStrAs<std::string>(row[0]);
    ptr->Total = parseStrAs<int>(row[1]);
    ptr->Time = parseStrAs<int>(row[2]);
    ptr->Repeat = parseStrAs<bool>(row[3]);
    for (int i = 4; i < 13; i += 3) 
    {
        ProbabilityGoodsDefine item;
        item.GoodsID = parseStrAs<std::string>(row[i + 0]);
        item.Num = parseStrAs<uint32_t>(row[i + 1]);
        item.Probability = parseStrAs<uint32_t>(row[i + 2]);
        ptr->ProbabilityGoods.push_back(item);
    }
    return 0;
}


} // namespace config 
