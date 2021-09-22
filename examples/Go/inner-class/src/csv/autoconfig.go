// This file is auto-generated by Tabugen v0.6.12, DO NOT EDIT!
package config

import (
	"log"
	"reflect"
	"strings"
)

var (
	_ = log.Panicf
	_ = reflect.TypeOf
	_ = strings.Split
)

const (
	TABUGEN_CSV_SEP     = `,` // CSV field delimiter
	TABUGEN_CSV_QUOTE   = `"` // CSV field quote
	TABUGEN_ARRAY_DELIM = `,` // array item delimiter
	TABUGEN_MAP_DELIM1  = `;` // map item delimiter
	TABUGEN_MAP_DELIM2  = `=` // map key-value delimiter
)

type ProbabilityGoodsDefine struct {
	GoodsID     string // 物品1id
	Num         uint32 // 物品1数量
	Probability uint32 // 物品1概率
}

// , 随机宝箱.xlsx
type BoxProbabilityDefine struct {
	ID               string                   // ID
	Total            int                      // 奖励总数
	Time             int                      // 冷却时间
	Repeat           bool                     // 是否可重复
	ProbabilityGoods []ProbabilityGoodsDefine //
}

func (p *BoxProbabilityDefine) ParseFromRow(row []string) error {
	if len(row) < 13 {
		log.Panicf("BoxProbabilityDefine: row length too short %d", len(row))
	}
	if row[0] != "" {
		p.ID = row[0]
	}
	if row[1] != "" {
		var value = parseStringAs(reflect.Int, row[1])
		p.Total = value.(int)
	}
	if row[2] != "" {
		var value = parseStringAs(reflect.Int, row[2])
		p.Time = value.(int)
	}
	if row[3] != "" {
		var value = parseStringAs(reflect.Bool, row[3])
		p.Repeat = value.(bool)
	}
	for i := 4; i < 13; i += 3 {
		var item ProbabilityGoodsDefine
		if row[i+0] != "" {
			item.GoodsID = row[i+0]
		}
		if row[i+1] != "" {
			var value = parseStringAs(reflect.Uint32, row[i+1])
			item.Num = value.(uint32)
		}
		if row[i+2] != "" {
			var value = parseStringAs(reflect.Uint32, row[i+2])
			item.Probability = value.(uint32)
		}
		p.ProbabilityGoods = append(p.ProbabilityGoods, item)
	}
	return nil
}
