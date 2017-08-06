package com.github.programInChinese.模型;

import java.util.HashMap;

public class 人物类 {

  private String 姓名;
  
  private HashMap<人物类, 关系类> 亲人 = new HashMap<>();
  
  public 人物类(String 姓名) {
    this.姓名 = 姓名;
  }
  
  public void 置家庭关系(人物类 他人, 关系类 关系) {
    亲人.put(他人, 关系);
  }
  
  public 关系类 取家庭关系(人物类 他人) {
    return 亲人.get(他人);
  }
}
