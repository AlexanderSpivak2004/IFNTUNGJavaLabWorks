package laboratory_work5.it.ip241k.spivak;

public class Operation<T> implements IOperation<T> {
    @Override
    public T[] unionSets(T[] firstSet, T[] secondSet) {
        // Create a joint array that combines both sets
        T[] jointArray = (T[]) new Object[firstSet.length + secondSet.length];

        System.arraycopy(firstSet, 0, jointArray, 0, firstSet.length);
        System.arraycopy(secondSet, 0, jointArray, firstSet.length, secondSet.length);

        // Create an array for unique elements
        T[] unionSet = (T[]) new Object[jointArray.length];

        // Add unique elements to unionSet
        int unionIndex = 0;
        for (int i = 0; i < jointArray.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < unionIndex; j++) {
                if (jointArray[i].equals(unionSet[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unionSet[unionIndex++] = jointArray[i];
            }
        }

        // Resize unionSet to fit the number of unique elements
        T[] finalUnionSet = (T[]) new Object[unionIndex];
        System.arraycopy(unionSet, 0, finalUnionSet, 0, unionIndex);

        return finalUnionSet;
    }

    @Override
    public T[] intersectionSets(T[] firstSet, T[] secondSet) {
        int jointElementsCount = 0;

        // Count the joint elements from two sets
        for (int i = 0; i < firstSet.length; i++) {
            for (int j = 0; j < secondSet.length; j++) {
                if (firstSet[i].equals(secondSet[j])) {
                    jointElementsCount++;
                }
            }
        }

        // Create an array for joint elements
        T[] intersectionSet = (T[]) new Object[jointElementsCount];

        // Add joint values to intersectionSet
        int intersectionSetIndex = 0;
        for (int i = 0; i < firstSet.length; i++) {
            for (int j = 0; j < secondSet.length; j++) {
                if (firstSet[i].equals(secondSet[j])) {
                    intersectionSet[intersectionSetIndex++] = secondSet[j];
                }
            }
        }

        return intersectionSet;
    }

    @Override
    public T[] differenceSets(T[] firstSet, T[] secondSet) {
        int differenceCount = 0;

        // Count elements which are in the first set but are not in the second
        for (int i = 0; i < firstSet.length; i++) {
            boolean isInSecondSet = false;

            for (int j = 0; j < secondSet.length; j++) {
                if (firstSet[i].equals(secondSet[j])) {
                    isInSecondSet = true;
                    break;
                }
            }

            if (!isInSecondSet) {
                differenceCount++;
            }

        }

        T[] differenceSet = (T[]) new Object[differenceCount];
        int differenceSetIndex = 0;

        for (int i = 0; i < firstSet.length; i++) {
            boolean isInSecondSet = false;

            for (int j = 0; j < secondSet.length; j++) {
                if (firstSet[i].equals(secondSet[j])) {
                    isInSecondSet = true;
                    break;
                }
            }

            if (!isInSecondSet) {
                differenceSet[differenceSetIndex++] = firstSet[i];
            }
        }

        return differenceSet;
    }

    @Override
    public T[] symmetricDiffSets(T[] firstSet, T[] secondSet) {
        int symmetricDiffCount = 0;

        // Count elements which are in the first set but are not in the second
        for (int i = 0; i < firstSet.length; i++) {
            boolean isInSecondSet = false;

            for (int j = 0; j < secondSet.length; j++) {
                if (firstSet[i].equals(secondSet[j])) {
                    isInSecondSet = true;
                    break;
                }
            }

            if (!isInSecondSet) {
                symmetricDiffCount++;
            }
        }

        // Count elements which are in the second set but are not in the first
        for (int i = 0; i < secondSet.length; i++) {
            boolean isInFirstSet = false;

            for (int j = 0; j < firstSet.length; j++) {
                if (secondSet[i].equals(firstSet[j])) {
                    isInFirstSet = true;
                    break;
                }
            }

            if (!isInFirstSet) {
                symmetricDiffCount++;
            }
        }

        // Create a symmetric difference set
        T[] symmetricDiffSet = (T[]) new Object[symmetricDiffCount];
        int symmetricDiffSetIndex = 0;

        // Insert elements which are in the first set but are not in the second
        for (int i = 0; i < firstSet.length; i++) {
            boolean isInSecondSet = false;

            for (int j = 0; j < secondSet.length; j++) {
                if (firstSet[i].equals(secondSet[j])) {
                    isInSecondSet = true;
                    break;
                }
            }

            if (!isInSecondSet) {
                symmetricDiffSet[symmetricDiffSetIndex++] = firstSet[i];
            }
        }

        // Insert elements which are in the second set but are not in the first
        for (int i = 0; i < secondSet.length; i++) {
            boolean isInFirstSet = false;

            for (int j = 0; j < firstSet.length; j++) {
                if (secondSet[i].equals(firstSet[j])) {
                    isInFirstSet = true;
                    break;
                }
            }

            if (!isInFirstSet) {
                symmetricDiffSet[symmetricDiffSetIndex++] = secondSet[i];
            }
        }

        return symmetricDiffSet;
    }
}
