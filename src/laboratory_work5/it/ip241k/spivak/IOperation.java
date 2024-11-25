package laboratory_work5.it.ip241k.spivak;

public interface IOperation<T> {
    T[] unionSets(T[] firstSet, T[] secondSet);

    T[] intersectionSets(T[] firstSet, T[] secondSet);

    T[] differenceSets(T[] firstSet, T[] secondSet);

    T[] symmetricDiffSets(T[] firstSet, T[] secondSet);
}
