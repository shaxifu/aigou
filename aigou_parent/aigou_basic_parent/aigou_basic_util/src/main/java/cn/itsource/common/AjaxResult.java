package cn.itsource.common;
/**
 * 返回结果类的封装
 */
public class AjaxResult {
    private Boolean success=true;//默认操作是否成功
    private String msg="操作成功";//默认的操作结果信息显示
    private Object obj=null;//返回后台的数据
    public static AjaxResult me(){
        return new AjaxResult();
    }
    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                '}';
    }
}
