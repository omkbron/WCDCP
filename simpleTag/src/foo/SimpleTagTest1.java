package foo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class SimpleTagTest1 extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().print("El peor uso de una custom tag");
    }

}

