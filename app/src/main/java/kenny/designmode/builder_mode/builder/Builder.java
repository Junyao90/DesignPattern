package kenny.designmode.builder_mode.builder;

import kenny.designmode.builder_mode.product.Computer;

/**
 * @author Junyao
 * @package kenny.designmode.builder_mode
 */

public abstract class Builder {
    public abstract Builder buildBoard(String board);

    public abstract Builder buildDisplay(String display);

    public abstract Builder buildOS();

    public abstract Computer create();

}
