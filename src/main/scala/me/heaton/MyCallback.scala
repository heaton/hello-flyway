package me.heaton

import java.sql.Connection

import org.flywaydb.core.api.MigrationInfo
import org.flywaydb.core.api.callback.FlywayCallback

class MyCallback extends FlywayCallback{
  override def afterInfo(connection: Connection): Unit = println("after info")
  override def beforeInit(connection: Connection): Unit = println("before init")
  override def beforeBaseline(connection: Connection): Unit = println("before baseline")
  override def beforeRepair(connection: Connection): Unit = println("before repair")
  override def afterInit(connection: Connection): Unit = println("after init")
  override def afterRepair(connection: Connection): Unit = println("after repair")
  override def afterValidate(connection: Connection): Unit = println("after validate")
  override def beforeEachMigrate(connection: Connection, info: MigrationInfo): Unit = println("before each migrate")
  override def afterEachMigrate(connection: Connection, info: MigrationInfo): Unit = println("after each migrate")
  override def afterMigrate(connection: Connection): Unit = println("after migrate")
  override def beforeValidate(connection: Connection): Unit = println("before validate")
  override def beforeInfo(connection: Connection): Unit = println("before info")
  override def afterBaseline(connection: Connection): Unit = println("after baseline")
  override def afterClean(connection: Connection): Unit = println("after clean")
  override def beforeClean(connection: Connection): Unit = println("before clean")
  override def beforeMigrate(connection: Connection): Unit = println("before migrate")
}
