package io;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FileSizeChecker {
    public Map<String, Long> checkSizeLimit(Map<String, Long> sizes, int limit) {
        return sizes.entrySet().stream()
                .filter(entry -> entry.getValue() <= limit)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public Map<String, Long> getFileSizes(String pathToFiles, List<String> files) {
        return files.stream().collect(Collectors.toMap(
                        Function.identity(),
                        fileName -> new File(pathToFiles + fileName).length()));
    }
}
