package com.github.programInChinese.模型;

import static com.github.programInChinese.测试.断言.相等;

import org.junit.Test;

public class 人物测试类 {

  @Test
  public void 单辈关系() {
    人物类 小明 = new 人物类("小明");
    人物类 小王 = new 人物类("小王");
    小明.置家庭关系(小王, 关系类.爸爸);

    相等(关系类.爸爸, 小明.取家庭关系(小王));
  }

  @Test
  public void 隔辈关系() {
    人物类 小明 = new 人物类("小明");
    人物类 小王 = new 人物类("小王");
    人物类 小红 = new 人物类("小红");
    
    小明.置家庭关系(小王, 关系类.爸爸);
    小王.置家庭关系(小红, 关系类.爸爸);

    相等(关系类.爷爷, 小明.取家庭关系(小红));
  }
}
