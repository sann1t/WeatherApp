package com.example.weatherapp.data.repositories.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherDatabase_Impl extends WeatherDatabase {
  private volatile WeatherDao _weatherDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `weatherInfoDatabase` (`base` TEXT, `visibility` INTEGER, `dt` INTEGER, `cityId` INTEGER, `cityName` TEXT NOT NULL, `cod` INTEGER, `longitude` REAL, `latitude` REAL, `temperature` INTEGER, `pressure` INTEGER, `humidity` INTEGER, `minimumTemperature` INTEGER, `maximumTemperature` INTEGER, `speed` INTEGER, `degreeDirection` INTEGER, `density` INTEGER, `type` INTEGER, `id` INTEGER, `message` REAL, `country` TEXT, `sunrise` INTEGER, `sunset` INTEGER, PRIMARY KEY(`cityName`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '17b868cb47f67218d36384a83dc9606f')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `weatherInfoDatabase`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsWeatherInfoDatabase = new HashMap<String, TableInfo.Column>(22);
        _columnsWeatherInfoDatabase.put("base", new TableInfo.Column("base", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("visibility", new TableInfo.Column("visibility", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("dt", new TableInfo.Column("dt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("cityId", new TableInfo.Column("cityId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("cityName", new TableInfo.Column("cityName", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("cod", new TableInfo.Column("cod", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("longitude", new TableInfo.Column("longitude", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("latitude", new TableInfo.Column("latitude", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("temperature", new TableInfo.Column("temperature", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("pressure", new TableInfo.Column("pressure", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("humidity", new TableInfo.Column("humidity", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("minimumTemperature", new TableInfo.Column("minimumTemperature", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("maximumTemperature", new TableInfo.Column("maximumTemperature", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("speed", new TableInfo.Column("speed", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("degreeDirection", new TableInfo.Column("degreeDirection", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("density", new TableInfo.Column("density", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("type", new TableInfo.Column("type", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("id", new TableInfo.Column("id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("message", new TableInfo.Column("message", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("country", new TableInfo.Column("country", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("sunrise", new TableInfo.Column("sunrise", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfoDatabase.put("sunset", new TableInfo.Column("sunset", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWeatherInfoDatabase = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWeatherInfoDatabase = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWeatherInfoDatabase = new TableInfo("weatherInfoDatabase", _columnsWeatherInfoDatabase, _foreignKeysWeatherInfoDatabase, _indicesWeatherInfoDatabase);
        final TableInfo _existingWeatherInfoDatabase = TableInfo.read(_db, "weatherInfoDatabase");
        if (! _infoWeatherInfoDatabase.equals(_existingWeatherInfoDatabase)) {
          return new RoomOpenHelper.ValidationResult(false, "weatherInfoDatabase(com.example.weatherapp.data.models.database.WeatherInfoDatabase).\n"
                  + " Expected:\n" + _infoWeatherInfoDatabase + "\n"
                  + " Found:\n" + _existingWeatherInfoDatabase);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "17b868cb47f67218d36384a83dc9606f", "4b6ca4d9b00ea142f1b145b78447da71");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "weatherInfoDatabase");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `weatherInfoDatabase`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(WeatherDao.class, WeatherDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public WeatherDao getWeatherDao() {
    if (_weatherDao != null) {
      return _weatherDao;
    } else {
      synchronized(this) {
        if(_weatherDao == null) {
          _weatherDao = new WeatherDao_Impl(this);
        }
        return _weatherDao;
      }
    }
  }
}
