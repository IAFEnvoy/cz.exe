package net.iafenvoy.cz.People;

import java.util.ArrayList;
import java.util.List;

import net.iafenvoy.cz.Utils.Enum.Sex;

public class 老师 {
    public String 名字,爱称;
    public int 年龄;
    public Sex 性别;
    public double 身高;
    public double 体重;
    public List<String> 职位=new ArrayList<>();
    public 老师(String 名字,String 爱称,int 年龄,Sex 性别,double 身高,double 体重,String... 职位){
        this.名字=名字;
        this.爱称=爱称;
        this.年龄=年龄;
        this.性别=性别;
        this.身高=身高;
        this.体重=体重;
        for(String s:职位)
            this.职位.add(s);
    }
    public void 开始上课(){

    }

    public void 下课(){

    }
}
