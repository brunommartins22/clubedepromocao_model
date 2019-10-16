
package br.com.interagese.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jose
 */
public class FormattedDateSerializer extends JsonSerializer<Date> {

    private final SimpleDateFormat sdf;

    public FormattedDateSerializer() {
        sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Override
    public void serialize(Date t, JsonGenerator jg, SerializerProvider sp) throws IOException {
        if (t == null) {
            jg.writeObject(t);
        } else {
            jg.writeObject(sdf.format(t));
        }
    }

}

