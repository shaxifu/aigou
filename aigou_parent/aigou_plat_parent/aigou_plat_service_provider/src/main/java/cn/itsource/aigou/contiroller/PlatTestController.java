package cn.itsource.aigou.contiroller;

import cn.itsource.common.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/plat")
public class PlatTestController {
    @RequestMapping("/test")
    public AjaxResult test (){
        Map<String,String> map =new HashMap();
        map.put("color", "blue");
        return AjaxResult.me().setSuccess(false).setMsg("操作失败");
    }
}
