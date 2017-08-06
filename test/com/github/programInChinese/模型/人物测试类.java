package com.github.programInChinese.模型;

import static com.github.programInChinese.测试.断言.相等;

import org.junit.Test;

public class 人物测试类 {

  @Test
  public void test() {
    人物类 小明 = new 人物类("小明");
    人物类 小王 = new 人物类("小王");
    小明.置家庭关系(小王, 关系类.爸爸);

    相等(关系类.爸爸, 小明.取家庭关系(小王));
  }

}
