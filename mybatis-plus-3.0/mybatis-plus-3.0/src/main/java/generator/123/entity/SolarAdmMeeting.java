package generator.123.entity;

import 你自己的父类实体,没有就不用设置!;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-06-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SolarAdmMeeting extends 你自己的父类实体,没有就不用设置! {

    private static final long serialVersionUID = 1L;

    /**
     * 会议室id
     */
    private Integer roomId;

    /**
     * 会议名
     */
    private String name;

    /**
     * 会议日期
     */
    private String date;

    /**
     * 会议时间段 
     */
    private String times;

    /**
     * 会议状态
     */
    private Integer state;

    /**
     * 会议发起者
     */
    private String ownerName;

    /**
     * 会议备注
     */
    private String note;

    /**
     * 会议参与人id
     */
    private String participantIds;

    /**
     * 会议参与名列表
     */
    private String participantNames;

    /**
     * 会议的位置Id
     */
    private Integer locationId;

    /**
     * 会议发起者id
     */
    private String ownerId;

    /**
     * 会议室信息
     */
    private String roomInfo;

    /**
     * 会议提醒状态
     */
    private Integer remindState;

    /**
     * 会议结束时间
     */
    private Integer meetingEndTime;

    /**
     * 会议定时
     */
    private String scheduleId;

    /**
     * 会议开始时间
     */
    private Integer meetingStartTime;

    /**
     * 会议提醒时间
     */
    private Integer remindTime;

    /**
     * 发起人头像
     */
    private String ownerAvatar;


}
