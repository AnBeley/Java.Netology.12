public class PosterManager {
    private Poster[] items = new Poster[0];
    private int defaultQuantity = 5;

    public PosterManager(int size) {
        if (size > 0) {
            defaultQuantity = size;
        }
    }

    public PosterManager() {
    }

    public void save(Poster item) {
        Poster[] tmp = new Poster[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public Poster[] findAll() {
        return items;
    }

    public Poster[] findLast() {
        int resultLength = items.length;
        if (resultLength < defaultQuantity) {
            defaultQuantity = resultLength;
        }
        Poster[] result = new Poster[defaultQuantity];
        for (int i = 0; i < result.length; i++) {
            result[i] = items[resultLength - 1 - i];
        }
        return result;
    }

}