package equalizer;

public final class FilterInfo {
    public final static short COUNT_OF_COFFS = 11;
    public static final double[] COFFS_NUM =  {
            9.625454173012e-13,9.625454173012e-12,4.331454377855e-11,1.155054500761e-10,
            2.021345376332e-10,2.425614451599e-10,2.021345376332e-10,1.155054500761e-10,
            4.331454377855e-11,9.625454173012e-12,9.625454173012e-13
            };

    public static final double[] COFFS_DEN =  {
            1,   -9.163269977748,    37.81702112544,   -92.56450614535,
            148.8078582473,   -164.1710393461,    125.8758673715,   -66.23100691364,
            22.88609440176,   -4.689786435228,   0.4327676730525
    };
}
