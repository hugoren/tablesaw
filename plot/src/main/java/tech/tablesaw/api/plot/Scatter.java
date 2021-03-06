package tech.tablesaw.api.plot;

import tech.tablesaw.api.NumericColumn;
import tech.tablesaw.api.ml.regression.LeastSquares;
import tech.tablesaw.kapi.NumericCol;
import tech.tablesaw.plotting.xchart.XchartScatter;
import tech.tablesaw.table.ViewGroup;

/**
 *
 */
public class Scatter {

    public static void show(NumericColumn x, NumericColumn y) {

        XchartScatter.show("Scatterplot", x, y);
    }

    public static void show(NumericCol x, NumericCol y) {

        XchartScatter.show("Scatterplot", x.target(), y.target());
    }

    public static void show(double[] x, double[] y) {

        XchartScatter.show("", x, "", y, "", 640, 480);
    }

    public static void show(double[] x, String xLabel, double[] y, String yLabel) {

        XchartScatter.show("", x, xLabel, y, yLabel, 640, 480);
    }

    public static void show(String title, NumericColumn x, NumericColumn y, ViewGroup groups) {
        XchartScatter.show(title, x, y, groups);
    }

    public static void show(String title, NumericCol x, NumericCol y, ViewGroup groups) {
        XchartScatter.show(title, x.target(), y.target(), groups);
    }

    public static void show(String title, NumericColumn x, NumericColumn y) {
        XchartScatter.show(title, x, y);
    }

    public static void show(String title, NumericCol x, NumericCol y) {
        XchartScatter.show(title, x.target(), y.target());
    }

    public static void fittedVsResidual(LeastSquares model) {
        XchartScatter.show("Fitted v. Residuals", "Fitted", model.fitted(), "Residuals", model.residuals());
    }

    public static void actualVsFitted(LeastSquares model) {
        XchartScatter.show("Actual v. Fitted", "Actuals", model.actuals(), "Fitted", model.fitted());
    }
}
