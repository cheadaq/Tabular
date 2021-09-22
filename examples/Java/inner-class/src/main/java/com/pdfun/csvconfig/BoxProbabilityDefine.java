// This file is auto-generated by Tabular v0.6.9, DO NOT EDIT!

package com.pdfun.csvconfig;

import java.util.*;
import java.io.IOException;
import org.apache.commons.csv.*;

// , 随机宝箱.xlsx
public class BoxProbabilityDefine
{
    public static class ProbabilityGoodsDefine 
    {
        public String GoodsID = "";       // 物品1id
        public int Num = 0;            // 物品1数量
        public int Probability = 0;    // 物品1概率
    }

    public String   ID = "";             // ID
    public int      Total = 0;           // 奖励总数
    public int      Time = 0;            // 冷却时间
    public boolean  Repeat = false;      // 是否可重复
    public List<ProbabilityGoodsDefine> ProbabilityGoods = new ArrayList<>(); 

    // parse fields data from record
    public void parseFrom(CSVRecord record)
    {
        if (record.size() < 13) {
            throw new RuntimeException(String.format("BoxProbabilityDefine: record length too short %d", record.size()));
        }
        if (!record.get(0).isEmpty()) {
            this.ID = record.get(0).trim();
        }
        if (!record.get(1).isEmpty()) {
            this.Total = Integer.parseInt(record.get(1));
        }
        if (!record.get(2).isEmpty()) {
            this.Time = Integer.parseInt(record.get(2));
        }
        if (!record.get(3).isEmpty()) {
            this.Repeat = AutogenConfigManager.parseBool(record.get(3));
        }
        for (int i = 4; i < 13; i += 3) 
        {
            ProbabilityGoodsDefine item = new ProbabilityGoodsDefine();
            if (!record.get(i + 0).isEmpty()) 
            {
                item.GoodsID = record.get(i + 0).trim();
            }
            if (!record.get(i + 1).isEmpty()) 
            {
                item.Num = Integer.parseInt(record.get(i + 1));
            }
            if (!record.get(i + 2).isEmpty()) 
            {
                item.Probability = Integer.parseInt(record.get(i + 2));
            }
            this.ProbabilityGoods.add(item);
        }
    }
}