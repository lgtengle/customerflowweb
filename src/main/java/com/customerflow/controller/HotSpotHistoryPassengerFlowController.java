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
@Api(value = "[Nile 1.4]热点区域历史监控(Hot spot History monitoring)")
public class HotSpotHistoryPassengerFlowController {

    /**
     *
     * @param appId app id
     * @param historyDate history date
     * @param areaNum area num
     * @param areaAtt area att
     * @param areaString area string
     * @return list
     */
    @RequestMapping(value = "/hotSpotHistoryMonitoring/residingTime", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "[Nile]热点区域历史驻留时长", notes = "get history residing time")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful query"),
            @ApiResponse(code = 404, message = "no found"),
            @ApiResponse(code = 500, message = "internal server error")})
    public ResponseEntity<?> getHistoryResidentCrowdCount(
            @ApiParam(value = "令牌(token)", required = false) @RequestParam(value = "token") String appId,
            @ApiParam(value = "历史日期", required = true) @RequestParam(value = "day") String historyDate,
            @ApiParam(value = "区域数量", required = true) @RequestParam(value = "area_num") int areaNum,
            @ApiParam(value = "区域类型", required = true) @RequestParam(value = "area_att") int areaAtt,
            @ApiParam(value = "区域/小区列表", required = true) @RequestParam(value = "area_id") String areaString,
            @ApiParam(value = "区域所属地市", required = false) @RequestParam(value = "city") String cityCode) {
        return  null;
    }




    /**
     *
     * @param appId app id
     * @param historyDate history date
     * @param areaAtt area att
     * @param areaString area string
     * @return list
     */
    @RequestMapping(value = "/hotSpotHistoryMonitoring/passengerDetails", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "[Nile]热点区域历史客流明细", notes = "get history passenger details")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful query"),
            @ApiResponse(code = 404, message = "no found"),
            @ApiResponse(code = 500, message = "internal server error")})
    public ResponseEntity<?> getPassengerDetails(
            @ApiParam(value = "令牌(token)", required = false) @RequestParam(value = "token") String appId,
            @ApiParam(value = "历史日期", required = true) @RequestParam(value = "start_date_time") String historyDate,
            @ApiParam(value = "区域类型", required = true) @RequestParam(value = "area_att") int areaAtt,
            @ApiParam(value = "区域/小区列表,（区域数量1个，小区不超过300个）", required = true) @RequestParam(value = "area_id") String areaString,
            @ApiParam(value = "区域所属地市", required = false) @RequestParam(value = "city") String cityCode) {
        return  null;
    }
}
