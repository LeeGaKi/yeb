package icu.lijiaqi.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author:LeeGaki
 * @date:2022/5/6
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespPageBean {
    /**
     * 总条数
     */
    private Long total;
    /**
     * 数据list
     */
    private List<?> data;

}