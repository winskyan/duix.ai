package ai.guiji.duix.sdk.client.util;

import android.util.Pair;

import java.util.LinkedHashMap;
import java.util.Map;

public class OrderedMap {
    private final Map<String, Integer> map = new LinkedHashMap<>();

    // 添加数据到Map
    public void addData(String key, int value) {
        map.put(key, value);
    }

    // 从Map开头获取数据并删除
    public Pair<String, Integer> getFirstDataAndRemove() {
        if (!map.isEmpty()) {
            Map.Entry<String, Integer> firstEntry = map.entrySet().iterator().next();
            String key = firstEntry.getKey();
            int value = firstEntry.getValue();
            map.remove(firstEntry.getKey());
            return new Pair<>(key, value);
        }
        return null; // 或者抛出异常，或者返回一个特定的值表示没有数据
    }

    // 检查Map是否为空
    public boolean isEmpty() {
        return map.isEmpty();
    }
}
