import com.database.DataBaseUser;
import com.database.Database;
import com.security.captcha.Captcha;
import com.security.expression.EvaluteMathExpression;
import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;
import de.congrace.exp4j.UnknownFunctionException;
import de.congrace.exp4j.UnparsableExpressionException;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.beans.Expression;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws UnparsableExpressionException, UnknownFunctionException, SQLException {
        DataBaseUser dbUser = new DataBaseUser();
        dbUser.createTable();

    }
}



