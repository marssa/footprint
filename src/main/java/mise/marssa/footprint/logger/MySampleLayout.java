package mise.marssa.footprint.logger;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;

public class MySampleLayout extends LayoutBase<ILoggingEvent> {

  public String doLayout(ILoggingEvent event) {
    StringBuffer sbuf = new StringBuffer(128);
    java.sql.Timestamp  sqlDate = new java.sql.Timestamp(event.getTimeStamp());
    sbuf.append(sqlDate+"\t");
    sbuf.append(" [");
    sbuf.append(event.getThreadName());
    sbuf.append("] ");
    sbuf.append(" ");
    sbuf.append(event.getLevel()+"\t");
    sbuf.append(" ");    
    sbuf.append(event.getLoggerName()+"\t");
    sbuf.append(" - ");
    sbuf.append(event.getFormattedMessage()+"\t - ");
    sbuf.append(event.getMarker());
    sbuf.append(CoreConstants.LINE_SEPARATOR);
    
    return sbuf.toString();
  }
}