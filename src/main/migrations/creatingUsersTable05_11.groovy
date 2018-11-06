databaseChangeLog {
    changeSet(author: "Veretennikov sergey (generated)", id: "1497549057046-1") {
        createTable(tableName: "users") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "userPK")
            }

            column(name: "login_email", type: "VARCHAR(55)") {
                constraints(nullable: "false")
            }

            column(name: "password", type: "VARCHAR(80)") {
                constraints(nullable: "false")
            }

            column(name: "role_user", type: "VARCHAR(55)") {
                constraints(nullable: "false")
            }
        }
    }
}