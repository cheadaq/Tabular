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
int NewbieGuideDefine::ParseFromRow(const CSVRow& row, NewbieGuideDefine* ptr)
{
    ASSERT(row.size() >= 6);
    ASSERT(ptr != nullptr);
    ptr->Name = parseStrAs<std::string>(row[0]);
    ptr->Type = parseStrAs<std::string>(row[1]);
    ptr->Target = parseStrAs<std::string>(row[2]);
    {
        const std::vector<absl::string_view>& array = absl::StrSplit(row[3], TABUGEN_ARRAY_DELIM);
        for (size_t i = 0; i < array.size(); i++)
        {
            ptr->Accomplishment.push_back(parseStrAs<int16_t>(array[i]));
        }
    }
    {
        const std::vector<absl::string_view>& vec = absl::StrSplit(row[4], TABUGEN_MAP_DELIM1);
        for (size_t i = 0; i < vec.size(); i++)
        {
            const std::vector<absl::string_view>& kv = absl::StrSplit(vec[i], TABUGEN_MAP_DELIM2);
            ASSERT(kv.size() == 2);
            if(kv.size() == 2)
            {
                const auto& key = parseStrAs<std::string>(kv[0]);
                ASSERT(ptr->Goods.count(key) == 0);
                ptr->Goods[key] = parseStrAs<uint32_t>(kv[1]);
            }
        }
    }
    ptr->Description = parseStrAs<std::string>(row[5]);
    return 0;
}


} // namespace config 
