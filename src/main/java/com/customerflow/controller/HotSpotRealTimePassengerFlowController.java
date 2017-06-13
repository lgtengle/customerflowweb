package com.customerflow.controller;

import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * description:
 * </p>
 * Created on 2017/6/9 15:54
 *
 * @author leiguang
 */
@RestController
@RequestMapping("/v1.0")
@Api(value = "[Nile 1.3]热点区域实时监控(Hot spot real-time monitoring)")
public class HotSpotRealTimePassengerFlowController {

    /**
     *
     * @param appId app id
     * @param areaNum area num
     * @param areaAtt area att
     * @param areaString area string
     * @param isIncludeResidentUser is Include Resident User
     * @return list
     */
    @RequestMapping(value = "/hotSpotRealTimeMonitoring/passengerVolume", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "[Nile]热点区域实时客流数", notes = "Get passenger volume")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful query"),
            @ApiResponse(code = 404, message = "no found"),
            @ApiResponse(code = 500, message = "internal server error")})
    public ResponseEntity<?> getPassengerVolume(
            @ApiParam(value = "令牌(token)", required = false) @RequestParam(value = "token") String appId,
            @ApiParam(value = "区域数量", required = true) @RequestParam(value = "area_num") int areaNum,
            @ApiParam(value = "区域类型", required = true) @RequestParam(value = "area_att") int areaAtt,
            @ApiParam(value = "区域或小区列表", required = true) @RequestParam(value = "area_id") String areaString,
            @ApiParam(value = "是否剔除常驻用户（只支持区域查询）.0代表是，1代表否。", required = false,defaultValue = "1") @RequestParam(value = "is_resident",required = false,defaultValue = "1") int isIncludeResidentUser,
            @ApiParam(value = "区域所属地市", required = false) @RequestParam(value = "city") String cityCode) {
        return  null;
    }




    /**
     *
     * @param appId app id
     * @param areaNum area num
     * @param areaString area string
     * @param cityCode city code
     * @param isIncludeResidentUser is Include Resident User
     * @return list
     */
    @RequestMapping(value = "/hotSpotRealTimeMonitoring/passengerOrigin", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "[Nile]热点区域实时客流来源", notes = "get passenger source")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful query"),
            @ApiResponse(code = 404, message = "no found"),
            @ApiResponse(code = 500, message = "internal server error")})
    public ResponseEntity<?> getPassengerOrigin(
            @ApiParam(value = "令牌(token)", required = false) @RequestParam(value = "token") String appId,
            @ApiParam(value = "区域数量", required = true) @RequestParam(value = "area_num") int areaNum,
            @ApiParam(value = "区域列表", required = true) @RequestParam(value = "area_id") String areaString,
            @ApiParam(value = "城市编号", required = true) @RequestParam(value = "city") String cityCode,
            @ApiParam(value = "是否剔除常驻用户（只支持区域查询）.0代表是，1代表否。", required = false,defaultValue = "1") @RequestParam(value = "is_resident",required = false,defaultValue = "1") int isIncludeResidentUser) {
        return  null;
   }





    /**
     *
     * @param appId app id
     * @param areaNum area num
     * @param areaString area string
     * @param isIncludeResidentUser is Include Resident User
     * @return list
     */
    @RequestMapping(value = "/hotSpotRealTimeMonitoring/residingTime", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "[Nile]热点区域实时驻留时长", notes = "get residing time")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful query"),
            @ApiResponse(code = 404, message = "no found"),
            @ApiResponse(code = 500, message = "internal server error")})
    public ResponseEntity<?> getResidingTime(
            @ApiParam(value = "令牌(token)", required = false) @RequestParam(value = "token") String appId,
            @ApiParam(value = "区域数量", required = true) @RequestParam(value = "area_num") int areaNum,
            @ApiParam(value = "区域列表（只支持区域查询）", required = true) @RequestParam(value = "area_id") String areaString,
            @ApiParam(value = "是否剔除常驻用户（只支持区域）.0代表是，1代表否。", required = false,defaultValue = "1") @RequestParam(value = "is_resident",defaultValue = "1",required = false) int isIncludeResidentUser,
            @ApiParam(value = "区域所属地市", required = false) @RequestParam(value = "city") String cityCode) {
        return  null;
    }




    /**
     *
     * @param appId app id
     * @param areaAtt area att
     * @param areaString area string
     * @return list
     */
    @RequestMapping(value = "/hotSpotRealTimeMonitoring/passengerDetails", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "[Nile]热点区域实时客流明细", notes = "get real-time passenger details")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful query"),
            @ApiResponse(code = 404, message = "no found"),
            @ApiResponse(code = 500, message = "internal server error")})
    public ResponseEntity<?> getPassengerDetails(
            @ApiParam(value = "令牌(token)", required = false) @RequestParam(value = "token") String appId,
            @ApiParam(value = "区域类型", required = true) @RequestParam(value = "area_att") int areaAtt,
            @ApiParam(value = "区域/小区列表,（区域数量1个，小区不超过300个）", required = true) @RequestParam(value = "area_id") String areaString,
            @ApiParam(value = "区域所属地市", required = false) @RequestParam(value = "city") String cityCode) {
        return  null;
    }
}
