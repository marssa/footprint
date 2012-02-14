/**
 * 
 */
package mise.marssa.footprint.logger;

import ch.qos.logback.classic.db.names.DBNameResolver;

/**
 * @author Warren Zahra
 *
 */
public class MyDBNameResolver  implements DBNameResolver{ 
    private String tableNamePrefix = "MYTABLE_"; 

             private String tableNameSuffix = ""; 
             public static final String SELECT_CURRVAL = "SELECT MYTABLE_event_id_seq.currval from dual"; 
             public <N extends Enum<?>> String getTableName(N tableName) { 
              
                    if(tableName.name().toLowerCase().equals("logging_event")) 
                        return tableNamePrefix + "event" + tableNameSuffix; 
                    if(tableName.name().toLowerCase().equals("logging_event_property")) 
                        return tableNamePrefix + "event_property" + tableNameSuffix; 
                    if(tableName.name().toLowerCase().equals("logging_event_exception")) 
                        return tableNamePrefix + "event_exception" + tableNameSuffix; 
                        
                        throw new IllegalArgumentException(tableName + " is an unknown table name"); 
            
             } 

              

              
             public <N extends Enum<?>> String getColumnName(N columnName) { 
                      
                     return columnName.name().toLowerCase() ;           
             } 

             public void setTableNamePrefix(String tableNamePrefix) { 
               this.tableNamePrefix = tableNamePrefix != null? tableNamePrefix : ""; 
             } 

             public void setTableNameSuffix(String tableNameSuffix) { 
               this.tableNameSuffix = tableNameSuffix != null? tableNameSuffix : ""; 
             } 
} 

