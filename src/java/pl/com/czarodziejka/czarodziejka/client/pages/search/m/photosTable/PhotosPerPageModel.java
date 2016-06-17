package pl.com.czarodziejka.czarodziejka.client.pages.search.m.photosTable;

import pl.com.czarodziejka.czarodziejka.client.pages.search.v.components.SelectOne;

/**
 *
 * @author Adam Mazur
 */
public class PhotosPerPageModel {

    public PhotosPerPageModel(SelectOne number) {
        number.addItem("12");
        number.addItem("16");
        number.addItem("20");
        number.addItem("36");
        number.addItem("60");
        number.addItem("100");
        number.addItem("200");
        number.setSelectedIndex(1);
    }
}
