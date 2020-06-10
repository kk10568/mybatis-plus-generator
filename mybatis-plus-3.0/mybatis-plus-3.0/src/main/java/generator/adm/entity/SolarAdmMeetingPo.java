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
@TableName("solar_adm_meeting")
@ApiModel(value="SolarAdmMeetingPo对象", description="")
public class SolarAdmMeetingPo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "会议室id")
    private Integer roomId;

    @ApiModelProperty(value = "会议名")
    private String name;

    @ApiModelProperty(value = "会议日期")
    private String date;

    @ApiModelProperty(value = "会议时间段 ")
    private String times;

    @ApiModelProperty(value = "会议状态")
    private Integer state;

    @ApiModelProperty(value = "会议发起者")
    private String ownerName;

    @ApiModelProperty(value = "会议备注")
    private String note;

    @ApiModelProperty(value = "会议参与人id")
    private String participantIds;

    @ApiModelProperty(value = "会议参与名列表")
    private String participantNames;

    @ApiModelProperty(value = "会议的位置Id")
    private Integer locationId;

    @ApiModelProperty(value = "会议发起者id")
    private String ownerId;

    @ApiModelProperty(value = "会议室信息")
    private String roomInfo;

    @ApiModelProperty(value = "会议提醒状态")
    private Integer remindState;

    @ApiModelProperty(value = "会议结束时间")
    private Integer meetingEndTime;

    @ApiModelProperty(value = "会议定时")
    private String scheduleId;

    @ApiModelProperty(value = "会议开始时间")
    private Integer meetingStartTime;

    @ApiModelProperty(value = "会议提醒时间")
    private Integer remindTime;

    @ApiModelProperty(value = "发起人头像")
    private String ownerAvatar;


}
