databaseChangeLog {
    changeSet( author: "Mikhail Nekhoroshev", id: "1" ){
        createTable( tableName: "testTable" ) {
            column( name: "id", type: "INT" ) {
                constraints( nullable: "false" )
            }
        }
    }
    changeSet( author: "Mikhail Nekhoroshev", id: "2" ){
        sql { """
              insert into testTable(id)
              values(1)
            """
        }
        sql { """
              insert into testTable(id)
              values(2)
            """
        }
        sql { """
              insert into testTable(id)
              values(3)
            """
        }
    }
}