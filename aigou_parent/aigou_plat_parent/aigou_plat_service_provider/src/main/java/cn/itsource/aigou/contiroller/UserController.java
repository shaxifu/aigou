package cn.itsource.aigou.contiroller;

import cn.itsource.common.AjaxResult;
import cn.itsource.domain.User;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        /*通过手动设置用户名和密码进行登录验证*/
        if (user!=null&& !StringUtils.isEmpty(user.getName())&& !StringUtils.isEmpty(user.getPassword())){
            if ("admin".equals(user.getName())&&"123456".equals(user.getPassword())){
                return AjaxResult.me().setMsg("登录成功");
            }else {
                return AjaxResult.me().setSuccess(false).setMsg("登录失败");
            }
        }
        return AjaxResult.me().setSuccess(false).setMsg("登录失败");
    }
}
