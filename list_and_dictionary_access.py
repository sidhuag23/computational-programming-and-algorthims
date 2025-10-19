
def CreateTable():
    list_datatype={ "Numerical_DATA":{
                                      "INT":["TINYINT","SMALLINT","MEDIUMINT","INTEGER","INT","BIGINT"],
                                      "DecimalANDReal":["DECIMAL(p,s)","NUMERIC","FLOAT","DOUBLE","REAL"],
                                      "serial": ["SERIAL","BIGSERIAL"],
                                      "BOOLEAN":["boolean"]
                                      },
                    "STRING_DATA":{    
                                       "CHAR_and_STRING":["CHAR(n)","VARCHAR(n)"],
                                       "TEXT_data":["TINY_TEXT","MEDIUM_TEXT","LONG_TEXT"],
                                       "Others":["ENUM","SET"]
                     },
                     "TIME":  {"Time_data" :[ "DATETIME","TIMESTAMP","YEAR"	,"INTERVAL"] }
	                 #need to add datas for more , Binary/blob data types , spatial , geometirc types , json , sepcialized type , 
                 }
    
    list_constraint = {  
         "constraints_data": {"constraints":[ "PRIMARY_KEY","FOREIGN_KEY","UNIQUE",	"NOT_NULL", "DEFAULT","AUTO_INCREMENT","SERIAL","CHECK","ON_UPDATE", "ON_DELETE" ,"ON_UPDATE FK","GENERATED ALWAYS AS"	,"STORED / VIRTUAL","INDEX","FULLTEXT"	,"SPATIAL INDEX","UNSIGNED"	]}}

    #print(list_constraint)

    print(list_datatype["Numerical_DATA"])

    print(list_datatype["Numerical_DATA"]["INT"][1])
    
    print("-----------")

    list_test = []
    for i in list_datatype:
       # print(f"{i} ----------- {list_datatype[i]}")
        for j in list_datatype[i]:
            list_test.append(list_datatype[i][j])
    print("--------------")
     
    for i in range(len(list_test)):
        for j in range(len(list_test[i])):
            print(list_test[i][j])

CreateTable()
