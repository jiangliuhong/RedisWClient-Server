package pers.jarome.redis.wclient.rs.vo;

/**
 * 
 * WclientConfigVo
 * @description 系统配置
 * @author jiangliuhong
 * @date 2018/8/15 21:13
 * @version 1.0.0
 */
public class WclientConfigVo {

    /**
     * 安装状态，true 需要安装
     */
    private Boolean install;

    public Boolean getInstall() {
        return install;
    }

    public void setInstall(Boolean install) {
        this.install = install;
    }
}
