package com.github.programInChinese.模型;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public enum 关系类 {
  爸爸, 儿子, 爷爷, 哥哥, 大伯;

  private static HashMap<List<关系类>, 关系类> 简化关系表 = new HashMap<>();
  
  static {
    简化关系表.put(Arrays.asList(关系类.爸爸, 关系类.爸爸), 关系类.爷爷);
    简化关系表.put(Arrays.asList(关系类.爸爸, 关系类.哥哥), 关系类.大伯);
    简化关系表.put(Arrays.asList(关系类.大伯, 关系类.爸爸), 关系类.爷爷);
  }
  
  public static 关系类 简化关系(List<关系类> 关系链) {
    if (简化关系表.containsKey(关系链)) {
      return 简化关系表.get(关系链);
    } else {
      if (关系链.size() > 2) {
        关系类 关系 = 简化关系表.get(关系链.subList(0, 2));
        if (关系 != null) {
          List<关系类> 简化关系链 = new ArrayList<>(关系链.subList(2, 关系链.size()));
          简化关系链.add(0, 关系);
          return 简化关系(简化关系链);
        }
      }
    }
    return null;
  }
}
