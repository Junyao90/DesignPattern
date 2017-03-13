package kenny.designpattern.builder_pattern.builder;

import kenny.designpattern.builder_pattern.product.Computer;

/**
 * @author Junyao
 */

public abstract class Builder {
    public abstract Builder buildBoard(String board);

    public abstract Builder buildDisplay(String display);

    public abstract Builder buildOS();

    public abstract Computer create();

}
