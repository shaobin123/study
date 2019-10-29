package Dto;

import java.io.Serializable;
import java.util.List;

/**
 * 批量删除
 */
public class citydto implements Serializable {

    /**
     * 要删除的id
     */
    private List<String> cityIds;

    public List<String> getCityIds() {
        return cityIds;
    }

    public void setCityIds(List<String> cityIds) {
        this.cityIds = cityIds;
    }
}
