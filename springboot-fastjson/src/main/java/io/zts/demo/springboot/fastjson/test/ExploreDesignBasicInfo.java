package io.zts.demo.springboot.fastjson.test;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExploreDesignBasicInfo {

    private int bBossOrderSource;

    @JSONField(name = "BBOSSOrderSource")
    public void setBBossOrderSource(int source){
        this.bBossOrderSource=source;
    }
}
