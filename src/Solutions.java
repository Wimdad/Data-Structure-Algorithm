import java.util.*;

public class Solutions {
    public static List<Integer> elements(int Q, List<int[]> query) {
        List<Integer> removedElements = new ArrayList<>();
        Map<Integer, LinkedList<Integer>> elementsToIndices = new HashMap<>();
        Map<Integer, Integer> elementFrequency = new HashMap<>();
        LinkedList<Integer> pipeline = new LinkedList<>();

        for (int i = 0; i < Q; i++) {
            int X = query.get(i)[0];
            int N = query.get(i)[1];

            if (X == 1) {
                // Insert N into the pipeline
                pipeline.addLast(N);

                // Update the element's frequency and indices
                elementFrequency.put(N, elementFrequency.getOrDefault(N, 0) + 1);
                elementsToIndices.computeIfAbsent(N, k -> new LinkedList<>()).addLast(pipeline.size() - 1);
            } else if (X == 2) {
                int elementToRemove = -1;
                int maxFrequency = 0;

                for (Map.Entry<Integer, Integer> entry : elementFrequency.entrySet()) {
                    int element = entry.getKey();
                    int frequency = entry.getValue();

                    if (frequency > maxFrequency) {
                        maxFrequency = frequency;
                        elementToRemove = element;
                    } else if (frequency == maxFrequency) {
                        LinkedList<Integer> indices = elementsToIndices.get(element);
                        LinkedList<Integer> indicesToRemove = elementsToIndices.get(elementToRemove);

                        if (indices.getLast() < indicesToRemove.getLast()) {
                            elementToRemove = element;
                        }
                    }
                }

                // Remove the selected element from the pipeline
                pipeline.removeLast();
                removedElements.add(elementToRemove);

                // Update the element's frequency and indices
                elementFrequency.put(elementToRemove, elementFrequency.get(elementToRemove) - 1);
                elementsToIndices.get(elementToRemove).removeLast();

                if (elementFrequency.get(elementToRemove) == 0) {
                    elementFrequency.remove(elementToRemove);
                    elementsToIndices.remove(elementToRemove);
                }
            }
        }

        return removedElements;
    }

    public static String codeHere(StringBuilder inputData) {
        String[] lines = inputData.toString().split("\n");
        int Q = Integer.parseInt(lines[0]);
        List<int[]> queries = new ArrayList<>();

        for (int i = 1; i <= Q; i++) {
            String[] tokens = lines[i].split(" ");
            int X = Integer.parseInt(tokens[0]);
            int N = Integer.parseInt(tokens[1]);
            queries.add(new int[]{X, N});
        }

        List<Integer> removedElements = elements(Q, queries);

        StringBuilder result = new StringBuilder();
        for (int element : removedElements) {
            result.append(element).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        StringBuilder inputData = new StringBuilder();
        inputData.append("6\n");
        inputData.append("1 2\n");
        inputData.append("1 4\n");
        inputData.append("1 3\n");
        inputData.append("1 2\n");
        inputData.append("2 -1\n");
        inputData.append("2 -1\n");

        String result = codeHere(inputData);
        System.out.println(result); // Output: "2 3"
    }
}
