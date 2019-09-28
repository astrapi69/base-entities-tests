package de.alpharogroup.basentcore.jpa.generator;

import de.alpharogroup.db.entity.Identifiable;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import java.io.Serializable;

public class IdentifiableSequenceStyleGenerator
    extends SequenceStyleGenerator
{

    @SuppressWarnings("rawtypes")
	public Serializable generate(SessionImplementor session,
        Object object) {
        if(object instanceof Identifiable) {
            Identifiable identifiable = (Identifiable) object;
            Serializable id = identifiable.getId();
            if(id != null) {
                return id;
            }
        }
        return super.generate(session, object);
    }
}