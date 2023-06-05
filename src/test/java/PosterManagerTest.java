import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    Poster item1 = new Poster("Bladshot");
    Poster item2 = new Poster("Ahead");
    Poster item3 = new Poster("Hotel Belgrad");
    Poster item4 = new Poster("Gentlemen");
    Poster item5 = new Poster("Invisible Man");
    Poster item6 = new Poster("Trolls");
    Poster item7 = new Poster("Number One");


    @Test
    public void save() {
        PosterManager manager = new PosterManager();

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

        Poster[] expected = {item1, item2, item3, item4, item5, item6, item7};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reversCustom() {
        PosterManager manager = new PosterManager(3);

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

        Poster[] expected = {item7, item6, item5};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void revers() {
        PosterManager manager = new PosterManager();

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

        Poster[] expected = {item7, item6, item5, item4, item3};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reversCustomBelow() {
        PosterManager manager = new PosterManager(-3);

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

        Poster[] expected = {item7, item6, item5, item4, item3};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void reversSmall() {
        PosterManager manager = new PosterManager();

        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

        Poster[] expected = {item7, item6, item5};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}