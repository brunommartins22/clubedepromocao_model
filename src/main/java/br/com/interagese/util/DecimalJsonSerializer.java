
package br.com.interagese.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalJsonSerializer extends JsonSerializer<Double>{

    @Override
    public void serialize(Double value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if(value == null)
            gen.writeNull();
        gen.writeNumber(new BigDecimal(value).setScale(2, RoundingMode.HALF_DOWN));
    }

}
