package generator.adm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mo-LingMing
 * @since 2020-06-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("solar_adm_room")
@ApiModel(value="SolarAdmRoomPo对象", description="")
public class SolarAdmRoomPo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "会议室名")
    private String name;

    @ApiModelProperty(value = "照片")
    private String image;

    @ApiModelProperty(value = "标签")
    private String tags;

    @ApiModelProperty(value = "会议状态")
    private Integer state;

    @ApiModelProperty(value = "会议备注")
    private String note;

    @ApiModelProperty(value = "位置id")
    private Integer locationId;


}
