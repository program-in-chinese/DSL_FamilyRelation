package com.github.programInChinese.模型;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 人物类 {

  private String 姓名;

  private HashMap<人物类, 关系类> 亲人 = new HashMap<>();

  public 人物类(String 姓名) {
    this.姓名 = 姓名;
  }

  /**
   * 设定自己是他人的什么人
   * 
   * @param 他人 另一个人
   * @param 关系 他人如何称呼自己
   */
  public void 置家庭关系(人物类 他人, 关系类 关系) {
    亲人.put(他人, 关系);
  }

  /**
   * 获取自己是他人的什么人
   * 
   * @param 他人
   * @return 他人对自己的称呼
   */
  public 关系类 取家庭关系(人物类 他人) {
    if (亲人.containsKey(他人)) {
      return 亲人.get(他人);
    } else {
      List<关系类> 关系链 = 获取关系链(他人);
      if (!关系链.isEmpty()) {
        return 关系类.简化关系(关系链);
      }
    }
    return null;
  }

  /**
   * 深度优先搜索, 获得第一个从自己到他人的关系路径
   */
  protected List<关系类> 获取关系链(人物类 他人) {
    List<关系类> 关系链 = new ArrayList<>();
    if (亲人.containsKey(他人)) {
      关系链.add(亲人.get(他人));
    } else {
      for (人物类 某亲人 : 亲人.keySet()) {
        List<关系类> 子关系链 = 某亲人.获取关系链(他人);
        if (!子关系链.isEmpty()) {
          关系链.add(亲人.get(某亲人));
          关系链.addAll(子关系链);
          break;
        }
      }
    }
    return 关系链;
  }
}
