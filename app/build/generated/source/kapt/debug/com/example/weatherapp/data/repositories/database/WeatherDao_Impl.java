package com.example.weatherapp.data.repositories.database;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.weatherapp.data.models.database.CloudsDatabase;
import com.example.weatherapp.data.models.database.CoordinatesDatabase;
import com.example.weatherapp.data.models.database.SysDatabase;
import com.example.weatherapp.data.models.database.WeatherDatabase;
import com.example.weatherapp.data.models.database.WeatherInfoDatabase;
import com.example.weatherapp.data.models.database.WindDatabase;
import java.lang.Class;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherDao_Impl implements WeatherDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WeatherInfoDatabase> __insertionAdapterOfWeatherInfoDatabase;

  private final SharedSQLiteStatement __preparedStmtOfDeleteWeather;

  public WeatherDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeatherInfoDatabase = new EntityInsertionAdapter<WeatherInfoDatabase>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `weatherInfoDatabase` (`base`,`visibility`,`dt`,`cityId`,`cityName`,`cod`,`longitude`,`latitude`,`temperature`,`pressure`,`humidity`,`minimumTemperature`,`maximumTemperature`,`speed`,`degreeDirection`,`density`,`type`,`id`,`message`,`country`,`sunrise`,`sunset`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherInfoDatabase value) {
        if (value.getBase() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getBase());
        }
        if (value.getVisibility() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getVisibility());
        }
        if (value.getDt() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getDt());
        }
        if (value.getCityId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getCityId());
        }
        if (value.getCityName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCityName());
        }
        if (value.getCod() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getCod());
        }
        final CoordinatesDatabase _tmpCoordinates = value.getCoordinates();
        if(_tmpCoordinates != null) {
          if (_tmpCoordinates.getLongitude() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindDouble(7, _tmpCoordinates.getLongitude());
          }
          if (_tmpCoordinates.getLatitude() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindDouble(8, _tmpCoordinates.getLatitude());
          }
        } else {
          stmt.bindNull(7);
          stmt.bindNull(8);
        }
        final WeatherDatabase _tmpMainWeatherData = value.getMainWeatherData();
        if(_tmpMainWeatherData != null) {
          if (_tmpMainWeatherData.getTemperature() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindLong(9, _tmpMainWeatherData.getTemperature());
          }
          if (_tmpMainWeatherData.getPressure() == null) {
            stmt.bindNull(10);
          } else {
            stmt.bindLong(10, _tmpMainWeatherData.getPressure());
          }
          if (_tmpMainWeatherData.getHumidity() == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindLong(11, _tmpMainWeatherData.getHumidity());
          }
          if (_tmpMainWeatherData.getMinimumTemperature() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindLong(12, _tmpMainWeatherData.getMinimumTemperature());
          }
          if (_tmpMainWeatherData.getMaximumTemperature() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindLong(13, _tmpMainWeatherData.getMaximumTemperature());
          }
        } else {
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
          stmt.bindNull(12);
          stmt.bindNull(13);
        }
        final WindDatabase _tmpWind = value.getWind();
        if(_tmpWind != null) {
          if (_tmpWind.getSpeed() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindLong(14, _tmpWind.getSpeed());
          }
          if (_tmpWind.getDegreeDirection() == null) {
            stmt.bindNull(15);
          } else {
            stmt.bindLong(15, _tmpWind.getDegreeDirection());
          }
        } else {
          stmt.bindNull(14);
          stmt.bindNull(15);
        }
        final CloudsDatabase _tmpClouds = value.getClouds();
        if(_tmpClouds != null) {
          if (_tmpClouds.getDensity() == null) {
            stmt.bindNull(16);
          } else {
            stmt.bindLong(16, _tmpClouds.getDensity());
          }
        } else {
          stmt.bindNull(16);
        }
        final SysDatabase _tmpSys = value.getSys();
        if(_tmpSys != null) {
          if (_tmpSys.getType() == null) {
            stmt.bindNull(17);
          } else {
            stmt.bindLong(17, _tmpSys.getType());
          }
          if (_tmpSys.getId() == null) {
            stmt.bindNull(18);
          } else {
            stmt.bindLong(18, _tmpSys.getId());
          }
          if (_tmpSys.getMessage() == null) {
            stmt.bindNull(19);
          } else {
            stmt.bindDouble(19, _tmpSys.getMessage());
          }
          if (_tmpSys.getCountry() == null) {
            stmt.bindNull(20);
          } else {
            stmt.bindString(20, _tmpSys.getCountry());
          }
          if (_tmpSys.getSunrise() == null) {
            stmt.bindNull(21);
          } else {
            stmt.bindLong(21, _tmpSys.getSunrise());
          }
          if (_tmpSys.getSunset() == null) {
            stmt.bindNull(22);
          } else {
            stmt.bindLong(22, _tmpSys.getSunset());
          }
        } else {
          stmt.bindNull(17);
          stmt.bindNull(18);
          stmt.bindNull(19);
          stmt.bindNull(20);
          stmt.bindNull(21);
          stmt.bindNull(22);
        }
      }
    };
    this.__preparedStmtOfDeleteWeather = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from weatherInfoDatabase WHERE cityName in(?)";
        return _query;
      }
    };
  }

  @Override
  public void insertWeather(final WeatherInfoDatabase weather) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWeatherInfoDatabase.insert(weather);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteWeather(final String cityName) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteWeather.acquire();
    int _argIndex = 1;
    if (cityName == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, cityName);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteWeather.release(_stmt);
    }
  }

  @Override
  public List<WeatherInfoDatabase> getWeather() {
    final String _sql = "SELECT * FROM weatherInfoDatabase";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfBase = CursorUtil.getColumnIndexOrThrow(_cursor, "base");
      final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility");
      final int _cursorIndexOfDt = CursorUtil.getColumnIndexOrThrow(_cursor, "dt");
      final int _cursorIndexOfCityId = CursorUtil.getColumnIndexOrThrow(_cursor, "cityId");
      final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "cityName");
      final int _cursorIndexOfCod = CursorUtil.getColumnIndexOrThrow(_cursor, "cod");
      final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
      final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
      final int _cursorIndexOfTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature");
      final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
      final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
      final int _cursorIndexOfMinimumTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "minimumTemperature");
      final int _cursorIndexOfMaximumTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "maximumTemperature");
      final int _cursorIndexOfSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "speed");
      final int _cursorIndexOfDegreeDirection = CursorUtil.getColumnIndexOrThrow(_cursor, "degreeDirection");
      final int _cursorIndexOfDensity = CursorUtil.getColumnIndexOrThrow(_cursor, "density");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
      final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
      final int _cursorIndexOfSunrise = CursorUtil.getColumnIndexOrThrow(_cursor, "sunrise");
      final int _cursorIndexOfSunset = CursorUtil.getColumnIndexOrThrow(_cursor, "sunset");
      final List<WeatherInfoDatabase> _result = new ArrayList<WeatherInfoDatabase>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final WeatherInfoDatabase _item;
        final CoordinatesDatabase _tmpCoordinates;
        if (! (_cursor.isNull(_cursorIndexOfLongitude) && _cursor.isNull(_cursorIndexOfLatitude))) {
          final Double _tmpLongitude;
          if (_cursor.isNull(_cursorIndexOfLongitude)) {
            _tmpLongitude = null;
          } else {
            _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
          }
          final Double _tmpLatitude;
          if (_cursor.isNull(_cursorIndexOfLatitude)) {
            _tmpLatitude = null;
          } else {
            _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
          }
          _tmpCoordinates = new CoordinatesDatabase(_tmpLongitude,_tmpLatitude);
        }  else  {
          _tmpCoordinates = null;
        }
        final WeatherDatabase _tmpMainWeatherData;
        if (! (_cursor.isNull(_cursorIndexOfTemperature) && _cursor.isNull(_cursorIndexOfPressure) && _cursor.isNull(_cursorIndexOfHumidity) && _cursor.isNull(_cursorIndexOfMinimumTemperature) && _cursor.isNull(_cursorIndexOfMaximumTemperature))) {
          final Integer _tmpTemperature;
          if (_cursor.isNull(_cursorIndexOfTemperature)) {
            _tmpTemperature = null;
          } else {
            _tmpTemperature = _cursor.getInt(_cursorIndexOfTemperature);
          }
          final Integer _tmpPressure;
          if (_cursor.isNull(_cursorIndexOfPressure)) {
            _tmpPressure = null;
          } else {
            _tmpPressure = _cursor.getInt(_cursorIndexOfPressure);
          }
          final Integer _tmpHumidity;
          if (_cursor.isNull(_cursorIndexOfHumidity)) {
            _tmpHumidity = null;
          } else {
            _tmpHumidity = _cursor.getInt(_cursorIndexOfHumidity);
          }
          final Integer _tmpMinimumTemperature;
          if (_cursor.isNull(_cursorIndexOfMinimumTemperature)) {
            _tmpMinimumTemperature = null;
          } else {
            _tmpMinimumTemperature = _cursor.getInt(_cursorIndexOfMinimumTemperature);
          }
          final Integer _tmpMaximumTemperature;
          if (_cursor.isNull(_cursorIndexOfMaximumTemperature)) {
            _tmpMaximumTemperature = null;
          } else {
            _tmpMaximumTemperature = _cursor.getInt(_cursorIndexOfMaximumTemperature);
          }
          _tmpMainWeatherData = new WeatherDatabase(_tmpTemperature,_tmpPressure,_tmpHumidity,_tmpMinimumTemperature,_tmpMaximumTemperature);
        }  else  {
          _tmpMainWeatherData = null;
        }
        final WindDatabase _tmpWind;
        if (! (_cursor.isNull(_cursorIndexOfSpeed) && _cursor.isNull(_cursorIndexOfDegreeDirection))) {
          final Integer _tmpSpeed;
          if (_cursor.isNull(_cursorIndexOfSpeed)) {
            _tmpSpeed = null;
          } else {
            _tmpSpeed = _cursor.getInt(_cursorIndexOfSpeed);
          }
          final Integer _tmpDegreeDirection;
          if (_cursor.isNull(_cursorIndexOfDegreeDirection)) {
            _tmpDegreeDirection = null;
          } else {
            _tmpDegreeDirection = _cursor.getInt(_cursorIndexOfDegreeDirection);
          }
          _tmpWind = new WindDatabase(_tmpSpeed,_tmpDegreeDirection);
        }  else  {
          _tmpWind = null;
        }
        final CloudsDatabase _tmpClouds;
        if (! (_cursor.isNull(_cursorIndexOfDensity))) {
          final Integer _tmpDensity;
          if (_cursor.isNull(_cursorIndexOfDensity)) {
            _tmpDensity = null;
          } else {
            _tmpDensity = _cursor.getInt(_cursorIndexOfDensity);
          }
          _tmpClouds = new CloudsDatabase(_tmpDensity);
        }  else  {
          _tmpClouds = null;
        }
        final SysDatabase _tmpSys;
        if (! (_cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfMessage) && _cursor.isNull(_cursorIndexOfCountry) && _cursor.isNull(_cursorIndexOfSunrise) && _cursor.isNull(_cursorIndexOfSunset))) {
          final Integer _tmpType;
          if (_cursor.isNull(_cursorIndexOfType)) {
            _tmpType = null;
          } else {
            _tmpType = _cursor.getInt(_cursorIndexOfType);
          }
          final Integer _tmpId;
          if (_cursor.isNull(_cursorIndexOfId)) {
            _tmpId = null;
          } else {
            _tmpId = _cursor.getInt(_cursorIndexOfId);
          }
          final Double _tmpMessage;
          if (_cursor.isNull(_cursorIndexOfMessage)) {
            _tmpMessage = null;
          } else {
            _tmpMessage = _cursor.getDouble(_cursorIndexOfMessage);
          }
          final String _tmpCountry;
          if (_cursor.isNull(_cursorIndexOfCountry)) {
            _tmpCountry = null;
          } else {
            _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
          }
          final Integer _tmpSunrise;
          if (_cursor.isNull(_cursorIndexOfSunrise)) {
            _tmpSunrise = null;
          } else {
            _tmpSunrise = _cursor.getInt(_cursorIndexOfSunrise);
          }
          final Integer _tmpSunset;
          if (_cursor.isNull(_cursorIndexOfSunset)) {
            _tmpSunset = null;
          } else {
            _tmpSunset = _cursor.getInt(_cursorIndexOfSunset);
          }
          _tmpSys = new SysDatabase(_tmpType,_tmpId,_tmpMessage,_tmpCountry,_tmpSunrise,_tmpSunset);
        }  else  {
          _tmpSys = null;
        }
        _item = new WeatherInfoDatabase();
        final String _tmpBase;
        if (_cursor.isNull(_cursorIndexOfBase)) {
          _tmpBase = null;
        } else {
          _tmpBase = _cursor.getString(_cursorIndexOfBase);
        }
        _item.setBase(_tmpBase);
        final Integer _tmpVisibility;
        if (_cursor.isNull(_cursorIndexOfVisibility)) {
          _tmpVisibility = null;
        } else {
          _tmpVisibility = _cursor.getInt(_cursorIndexOfVisibility);
        }
        _item.setVisibility(_tmpVisibility);
        final Integer _tmpDt;
        if (_cursor.isNull(_cursorIndexOfDt)) {
          _tmpDt = null;
        } else {
          _tmpDt = _cursor.getInt(_cursorIndexOfDt);
        }
        _item.setDt(_tmpDt);
        final Integer _tmpCityId;
        if (_cursor.isNull(_cursorIndexOfCityId)) {
          _tmpCityId = null;
        } else {
          _tmpCityId = _cursor.getInt(_cursorIndexOfCityId);
        }
        _item.setCityId(_tmpCityId);
        final String _tmpCityName;
        if (_cursor.isNull(_cursorIndexOfCityName)) {
          _tmpCityName = null;
        } else {
          _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
        }
        _item.setCityName(_tmpCityName);
        final Integer _tmpCod;
        if (_cursor.isNull(_cursorIndexOfCod)) {
          _tmpCod = null;
        } else {
          _tmpCod = _cursor.getInt(_cursorIndexOfCod);
        }
        _item.setCod(_tmpCod);
        _item.setCoordinates(_tmpCoordinates);
        _item.setMainWeatherData(_tmpMainWeatherData);
        _item.setWind(_tmpWind);
        _item.setClouds(_tmpClouds);
        _item.setSys(_tmpSys);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public WeatherInfoDatabase getWeatherByCityName(final String cityName) {
    final String _sql = "SELECT * FROM weatherInfoDatabase WHERE cityName LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (cityName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, cityName);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfBase = CursorUtil.getColumnIndexOrThrow(_cursor, "base");
      final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility");
      final int _cursorIndexOfDt = CursorUtil.getColumnIndexOrThrow(_cursor, "dt");
      final int _cursorIndexOfCityId = CursorUtil.getColumnIndexOrThrow(_cursor, "cityId");
      final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "cityName");
      final int _cursorIndexOfCod = CursorUtil.getColumnIndexOrThrow(_cursor, "cod");
      final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
      final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
      final int _cursorIndexOfTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature");
      final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
      final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
      final int _cursorIndexOfMinimumTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "minimumTemperature");
      final int _cursorIndexOfMaximumTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "maximumTemperature");
      final int _cursorIndexOfSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "speed");
      final int _cursorIndexOfDegreeDirection = CursorUtil.getColumnIndexOrThrow(_cursor, "degreeDirection");
      final int _cursorIndexOfDensity = CursorUtil.getColumnIndexOrThrow(_cursor, "density");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
      final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
      final int _cursorIndexOfSunrise = CursorUtil.getColumnIndexOrThrow(_cursor, "sunrise");
      final int _cursorIndexOfSunset = CursorUtil.getColumnIndexOrThrow(_cursor, "sunset");
      final WeatherInfoDatabase _result;
      if(_cursor.moveToFirst()) {
        final CoordinatesDatabase _tmpCoordinates;
        if (! (_cursor.isNull(_cursorIndexOfLongitude) && _cursor.isNull(_cursorIndexOfLatitude))) {
          final Double _tmpLongitude;
          if (_cursor.isNull(_cursorIndexOfLongitude)) {
            _tmpLongitude = null;
          } else {
            _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
          }
          final Double _tmpLatitude;
          if (_cursor.isNull(_cursorIndexOfLatitude)) {
            _tmpLatitude = null;
          } else {
            _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
          }
          _tmpCoordinates = new CoordinatesDatabase(_tmpLongitude,_tmpLatitude);
        }  else  {
          _tmpCoordinates = null;
        }
        final WeatherDatabase _tmpMainWeatherData;
        if (! (_cursor.isNull(_cursorIndexOfTemperature) && _cursor.isNull(_cursorIndexOfPressure) && _cursor.isNull(_cursorIndexOfHumidity) && _cursor.isNull(_cursorIndexOfMinimumTemperature) && _cursor.isNull(_cursorIndexOfMaximumTemperature))) {
          final Integer _tmpTemperature;
          if (_cursor.isNull(_cursorIndexOfTemperature)) {
            _tmpTemperature = null;
          } else {
            _tmpTemperature = _cursor.getInt(_cursorIndexOfTemperature);
          }
          final Integer _tmpPressure;
          if (_cursor.isNull(_cursorIndexOfPressure)) {
            _tmpPressure = null;
          } else {
            _tmpPressure = _cursor.getInt(_cursorIndexOfPressure);
          }
          final Integer _tmpHumidity;
          if (_cursor.isNull(_cursorIndexOfHumidity)) {
            _tmpHumidity = null;
          } else {
            _tmpHumidity = _cursor.getInt(_cursorIndexOfHumidity);
          }
          final Integer _tmpMinimumTemperature;
          if (_cursor.isNull(_cursorIndexOfMinimumTemperature)) {
            _tmpMinimumTemperature = null;
          } else {
            _tmpMinimumTemperature = _cursor.getInt(_cursorIndexOfMinimumTemperature);
          }
          final Integer _tmpMaximumTemperature;
          if (_cursor.isNull(_cursorIndexOfMaximumTemperature)) {
            _tmpMaximumTemperature = null;
          } else {
            _tmpMaximumTemperature = _cursor.getInt(_cursorIndexOfMaximumTemperature);
          }
          _tmpMainWeatherData = new WeatherDatabase(_tmpTemperature,_tmpPressure,_tmpHumidity,_tmpMinimumTemperature,_tmpMaximumTemperature);
        }  else  {
          _tmpMainWeatherData = null;
        }
        final WindDatabase _tmpWind;
        if (! (_cursor.isNull(_cursorIndexOfSpeed) && _cursor.isNull(_cursorIndexOfDegreeDirection))) {
          final Integer _tmpSpeed;
          if (_cursor.isNull(_cursorIndexOfSpeed)) {
            _tmpSpeed = null;
          } else {
            _tmpSpeed = _cursor.getInt(_cursorIndexOfSpeed);
          }
          final Integer _tmpDegreeDirection;
          if (_cursor.isNull(_cursorIndexOfDegreeDirection)) {
            _tmpDegreeDirection = null;
          } else {
            _tmpDegreeDirection = _cursor.getInt(_cursorIndexOfDegreeDirection);
          }
          _tmpWind = new WindDatabase(_tmpSpeed,_tmpDegreeDirection);
        }  else  {
          _tmpWind = null;
        }
        final CloudsDatabase _tmpClouds;
        if (! (_cursor.isNull(_cursorIndexOfDensity))) {
          final Integer _tmpDensity;
          if (_cursor.isNull(_cursorIndexOfDensity)) {
            _tmpDensity = null;
          } else {
            _tmpDensity = _cursor.getInt(_cursorIndexOfDensity);
          }
          _tmpClouds = new CloudsDatabase(_tmpDensity);
        }  else  {
          _tmpClouds = null;
        }
        final SysDatabase _tmpSys;
        if (! (_cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfMessage) && _cursor.isNull(_cursorIndexOfCountry) && _cursor.isNull(_cursorIndexOfSunrise) && _cursor.isNull(_cursorIndexOfSunset))) {
          final Integer _tmpType;
          if (_cursor.isNull(_cursorIndexOfType)) {
            _tmpType = null;
          } else {
            _tmpType = _cursor.getInt(_cursorIndexOfType);
          }
          final Integer _tmpId;
          if (_cursor.isNull(_cursorIndexOfId)) {
            _tmpId = null;
          } else {
            _tmpId = _cursor.getInt(_cursorIndexOfId);
          }
          final Double _tmpMessage;
          if (_cursor.isNull(_cursorIndexOfMessage)) {
            _tmpMessage = null;
          } else {
            _tmpMessage = _cursor.getDouble(_cursorIndexOfMessage);
          }
          final String _tmpCountry;
          if (_cursor.isNull(_cursorIndexOfCountry)) {
            _tmpCountry = null;
          } else {
            _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
          }
          final Integer _tmpSunrise;
          if (_cursor.isNull(_cursorIndexOfSunrise)) {
            _tmpSunrise = null;
          } else {
            _tmpSunrise = _cursor.getInt(_cursorIndexOfSunrise);
          }
          final Integer _tmpSunset;
          if (_cursor.isNull(_cursorIndexOfSunset)) {
            _tmpSunset = null;
          } else {
            _tmpSunset = _cursor.getInt(_cursorIndexOfSunset);
          }
          _tmpSys = new SysDatabase(_tmpType,_tmpId,_tmpMessage,_tmpCountry,_tmpSunrise,_tmpSunset);
        }  else  {
          _tmpSys = null;
        }
        _result = new WeatherInfoDatabase();
        final String _tmpBase;
        if (_cursor.isNull(_cursorIndexOfBase)) {
          _tmpBase = null;
        } else {
          _tmpBase = _cursor.getString(_cursorIndexOfBase);
        }
        _result.setBase(_tmpBase);
        final Integer _tmpVisibility;
        if (_cursor.isNull(_cursorIndexOfVisibility)) {
          _tmpVisibility = null;
        } else {
          _tmpVisibility = _cursor.getInt(_cursorIndexOfVisibility);
        }
        _result.setVisibility(_tmpVisibility);
        final Integer _tmpDt;
        if (_cursor.isNull(_cursorIndexOfDt)) {
          _tmpDt = null;
        } else {
          _tmpDt = _cursor.getInt(_cursorIndexOfDt);
        }
        _result.setDt(_tmpDt);
        final Integer _tmpCityId;
        if (_cursor.isNull(_cursorIndexOfCityId)) {
          _tmpCityId = null;
        } else {
          _tmpCityId = _cursor.getInt(_cursorIndexOfCityId);
        }
        _result.setCityId(_tmpCityId);
        final String _tmpCityName;
        if (_cursor.isNull(_cursorIndexOfCityName)) {
          _tmpCityName = null;
        } else {
          _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
        }
        _result.setCityName(_tmpCityName);
        final Integer _tmpCod;
        if (_cursor.isNull(_cursorIndexOfCod)) {
          _tmpCod = null;
        } else {
          _tmpCod = _cursor.getInt(_cursorIndexOfCod);
        }
        _result.setCod(_tmpCod);
        _result.setCoordinates(_tmpCoordinates);
        _result.setMainWeatherData(_tmpMainWeatherData);
        _result.setWind(_tmpWind);
        _result.setClouds(_tmpClouds);
        _result.setSys(_tmpSys);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
