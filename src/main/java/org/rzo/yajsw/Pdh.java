package org.rzo.yajsw;
/* This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * <p/>
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 */

import java.util.HashMap;
import java.util.Map;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Union;
import com.sun.jna.WString;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import com.sun.jna.win32.StdCallLibrary;

// TODO: Auto-generated Javadoc
/**
 * The Class Pdh.
 */
public class Pdh
{

	/**
	 * The Interface Pdhdll.
	 */
	interface Pdhdll extends StdCallLibrary
	{

		/** The INSTANCE. */
		Pdhdll	INSTANCE	= (Pdhdll) Native.loadLibrary("pdh", Pdhdll.class);

		/*
		 * PDH_STATUS PdhOpenQuery( __in LPCTSTR szDataSource, __in DWORD_PTR
		 * dwUserData, __out PDH_HQUERY phQuery );
		 */
		/**
		 * Pdh open query.
		 *
		 * @param szDataSource
		 *            the sz data source
		 * @param dwUserData
		 *            the dw user data
		 * @param phQuery
		 *            the ph query
		 *
		 * @return the int
		 */
		int PdhOpenQuery(Pointer szDataSource, Pointer dwUserData, PointerByReference phQuery);

		/*
		 * PDH_STATUS PdhValidatePath( __in LPCTSTR szFullCounterPath );
		 */
		/**
		 * Pdh validate path a.
		 *
		 * @param szFullCounterPath
		 *            the sz full counter path
		 *
		 * @return the int
		 */
		int PdhValidatePathA(String szFullCounterPath);

		/*
		 * PDH_STATUS PdhCollectQueryData( __in_out PDH_HQUERY hQuery );
		 */
		/**
		 * Pdh collect query data.
		 *
		 * @param hQuery
		 *            the h query
		 *
		 * @return the int
		 */
		int PdhCollectQueryData(Pointer hQuery);

		/*
		 * PDH_STATUS PdhGetFormattedCounterValue( __in PDH_HCOUNTER hCounter,
		 * __in DWORD dwFormat, __out LPDWORD lpdwType, __out
		 * PPDH_FMT_COUNTERVALUE pValue );
		 */
		/**
		 * Pdh get formatted counter value.
		 *
		 * @param hCounter
		 *            the h counter
		 * @param dwFormat
		 *            the dw format
		 * @param lpdwType
		 *            the lpdw type
		 * @param pValue
		 *            the value
		 *
		 * @return the int
		 */
		int PdhGetFormattedCounterValue(Pointer hCounter, int dwFormat, IntByReference lpdwType, Pointer pValue);

		/*
		 * typedef struct _PDH_FMT_COUNTERVALUE { DWORD CStatus; union { LONG
		 * longValue; double doubleValue; LONGLONG largeValue; LPCSTR
		 * AnsiStringValue; LPCWSTR WideStringValue; }; } PDH_FMT_COUNTERVALUE,
		 * PPDH_FMT_COUNTERVALUE;
		 */

		/*
		 * PDH_STATUS PdhAddCounter( __in PDH_HQUERY hQuery, __in LPCTSTR
		 * szFullCounterPath, __in DWORD_PTR dwUserData, __out PDH_HCOUNTER
		 * phCounter );
		 */
		/**
		 * Pdh add counter a.
		 *
		 * @param hQuery
		 *            the h query
		 * @param szFullCounterPath
		 *            the sz full counter path
		 * @param dwUserData
		 *            the dw user data
		 * @param phCounter
		 *            the ph counter
		 *
		 * @return the int
		 */
		int PdhAddCounterA(Pointer hQuery, String szFullCounterPath, int dwUserData, PointerByReference phCounter);

		/*
		 * PDH_STATUS PdhAddEnglishCounter( __in PDH_HQUERY hQuery, __in LPCTSTR
		 * szFullCounterPath, __in DWORD_PTR dwUserData, __out PDH_HCOUNTER
		 * phCounter );
		 */
		/**
		 * Pdh add009 counter a.
		 *
		 * @param hQuery
		 *            the h query
		 * @param szFullCounterPath
		 *            the sz full counter path
		 * @param dwUserData
		 *            the dw user data
		 * @param phCounter
		 *            the ph counter
		 *
		 * @return the int
		 */
		int PdhAdd009CounterA(Pointer hQuery, String szFullCounterPath, int dwUserData, PointerByReference phCounter);

		/** The ERRO r_ success. */
		int	ERROR_SUCCESS	= 0;

		/** The PD h_ fm t_ double. */
		int	PDH_FMT_DOUBLE	= 0x00000200;

		/** The PD h_ fm t_ long. */
		int	PDH_FMT_LONG	= 0x00000100;

		/*
		 * PDH_STATUS PdhRemoveCounter( __in PDH_HCOUNTER hCounter );
		 */
		/**
		 * Pdh remove counter.
		 *
		 * @param hCounter
		 *            the h counter
		 *
		 * @return the int
		 */
		int PdhRemoveCounter(Pointer hCounter);

		/*
		 * PDH_STATUS PdhCloseQuery( __in PDH_HQUERY hQuery );
		 */
		/**
		 * Pdh close query.
		 *
		 * @param hQuery
		 *            the h query
		 *
		 * @return the int
		 */
		int PdhCloseQuery(Pointer hQuery);

		/*
		 * PDH_STATUS PdhEnumObjectItems( __in LPCTSTR szDataSource, __in
		 * LPCTSTR szMachineName, __in LPCTSTR szObjectName, __out LPTSTR
		 * mszCounterList, __in_out LPDWORD pcchCounterListLength, __out LPTSTR
		 * mszInstanceList, __in_out LPDWORD pcchInstanceListLength, __in DWORD
		 * dwDetailLevel, DWORD dwFlags );
		 */
		/**
		 * Pdh enum object items a.
		 *
		 * @param szDataSource
		 *            the sz data source
		 * @param szMachineName
		 *            the sz machine name
		 * @param szObjectName
		 *            the sz object name
		 * @param mszCounterList
		 *            the msz counter list
		 * @param pcchCounterListLength
		 *            the pcch counter list length
		 * @param mszInstanceList
		 *            the msz instance list
		 * @param pcchInstanceListLength
		 *            the pcch instance list length
		 * @param dwDetailLevel
		 *            the dw detail level
		 * @param dwFlags
		 *            the dw flags
		 *
		 * @return the int
		 */
		int PdhEnumObjectItemsA(String szDataSource, String szMachineName, String szObjectName, Memory mszCounterList,
				IntByReference pcchCounterListLength, Memory mszInstanceList, IntByReference pcchInstanceListLength, int dwDetailLevel, int dwFlags);

		/** The PER f_ detai l_ wizard. */
		int	PERF_DETAIL_WIZARD	= 400;

		/** The PD h_ mor e_ data. */
		int	PDH_MORE_DATA		= 0x800007D2;

		/*
		 * DH_STATUS PdhLookupPerfNameByIndex( __in LPCTSTR szMachineName, __in
		 * DWORD dwNameIndex, __out LPTSTR szNameBuffer, __in LPDWORD
		 * pcchNameBufferSize );
		 */
		/**
		 * Pdh lookup perf name by index a.
		 *
		 * @param szMachineName
		 *            the sz machine name
		 * @param dwNameIndex
		 *            the dw name index
		 * @param szNameBuffer
		 *            the sz name buffer
		 * @param pcchNameBufferSize
		 *            the pcch name buffer size
		 *
		 * @return the int
		 */
		int PdhLookupPerfNameByIndexA(String szMachineName, int dwNameIndex, Memory szNameBuffer, IntByReference pcchNameBufferSize);

		/*
		 * PDH_STATUS PdhParseCounterPath( __in LPCTSTR szFullPathBuffer, __out
		 * PDH_COUNTER_PATH_ELEMENTS pCounterPathElements, __in_out LPDWORD
		 * pdwBufferSize, DWORD dwFlags );
		 */
		/**
		 * Pdh parse counter path a.
		 *
		 * @param szFullPathBuffer
		 *            the sz full path buffer
		 * @param pCounterPathElements
		 *            the counter path elements
		 * @param pdwBufferSize
		 *            the pdw buffer size
		 * @param dwFlags
		 *            the dw flags
		 *
		 * @return the int
		 */
		int PdhParseCounterPathA(String szFullPathBuffer, Pointer pCounterPathElements, IntByReference pdwBufferSize, int dwFlags);

	}// Pdhdll

	/**
	 * The Interface Advapi32.
	 */
	interface Advapi32 extends StdCallLibrary
	{

		/** The INSTANCE. */
		Advapi32	INSTANCE	= (Advapi32) Native.loadLibrary("Advapi32", Advapi32.class);	// ,
																								// Options.UNICODE_OPTIONS);

		/*
		 * LONG WINAPI RegOpenKeyEx( HKEY hKey, LPCTSTR lpSubKey, DWORD
		 * ulOptions, REGSAM samDesired, PHKEY phkResult );
		 */
		/**
		 * Reg open key ex a.
		 *
		 * @param hKey
		 *            the h key
		 * @param lpSubKey
		 *            the lp sub key
		 * @param ulOptions
		 *            the ul options
		 * @param samDesired
		 *            the sam desired
		 * @param phkResult
		 *            the phk result
		 *
		 * @return the int
		 */
		int RegOpenKeyExA(int hKey, String lpSubKey, int ulOptions, int samDesired, IntByReference phkResult);

		/** The HKE y_ loca l_ machine. */
		int	HKEY_LOCAL_MACHINE	= 0x80000002;

		/** The KE y_ read. */
		int	KEY_READ			= 0x20019;

		/*
		 * LONG WINAPI RegCloseKey( HKEY hKey );
		 */
		/**
		 * Reg close key.
		 *
		 * @param hKey
		 *            the h key
		 *
		 * @return the int
		 */
		public int RegCloseKey(int hKey);

		/*
		 * LONG WINAPI RegQueryValueEx( __in HKEY hKey, __in LPCTSTR
		 * lpValueName, LPDWORD lpReserved, __out LPDWORD lpType, __out LPBYTE
		 * lpData, __in_out LPDWORD lpcbData );
		 */
		/**
		 * Reg query value ex a.
		 *
		 * @param hKey
		 *            the h key
		 * @param lpValueName
		 *            the lp value name
		 * @param lpReserved
		 *            the lp reserved
		 * @param lpType
		 *            the lp type
		 * @param lpData
		 *            the lp data
		 * @param lpcbData
		 *            the lpcb data
		 *
		 * @return the int
		 */
		int RegQueryValueExA(int hKey, String lpValueName, Pointer lpReserved, IntByReference lpType, Pointer lpData, IntByReference lpcbData);

		/** The HKE y_ performanc e_ data. */
		int	HKEY_PERFORMANCE_DATA	= 0x80000004;

		/** The ERRO r_ mor e_ data. */
		int	ERROR_MORE_DATA			= 234;

	}

	/**
	 * The Class PDH_FMT_COUNTERVALUE.
	 */
	public static class PDH_FMT_COUNTERVALUE extends Structure
	{

		/** The C status. */
		public int			CStatus;

		/** The Value. */
		public ValueUnion	Value;
	}

	/**
	 * The Class ValueUnion.
	 */
	public static class ValueUnion extends Union
	{

		/** The long value. */
		public int		longValue;

		/** The double value. */
		public double	doubleValue;

		/** The large value. */
		public long		largeValue;

		/** The Ansi string value. */
		public String	AnsiStringValue;

		/** The Wide string value. */
		public WString	WideStringValue;
	}

	/**
	 * The Class COUNTER_PATH_ELEMENTS.
	 */
	public static class COUNTER_PATH_ELEMENTS
	{

		/** The sz machine name. */
		public String	szMachineName;

		/** The sz object name. */
		public String	szObjectName;

		/** The sz instance name. */
		public String	szInstanceName;

		/** The dw instance index. */
		public int		dwInstanceIndex;

		/** The sz counter name. */
		public String	szCounterName;

	}

	/** The MA x_ counte r_ path. */
	static int	MAX_COUNTER_PATH		= 256;	// Maximum counter path length

	/** The PD h_ ma x_ counte r_ name. */
	static int	PDH_MAX_COUNTER_NAME	= 1024; // Maximum counter name length.

	/** The PD h_ ma x_ instanc e_ name. */
	static int	PDH_MAX_INSTANCE_NAME	= 1024; // Maximum counter instance name
	// length.
	/** The PD h_ ma x_ counte r_ path. */
	static int	PDH_MAX_COUNTER_PATH	= 2048; // Maximum full counter path

	/**
	 * The Class Counter.
	 */
	static public class Counter implements PdhCounter
	{

		/** The _h query. */
		PointerByReference	_hQuery		= new PointerByReference();

		/** The _h counter. */
		PointerByReference	_hCounter	= new PointerByReference();

		/** The _counter. */
		String				_counter;

		/**
		 * Instantiates a new counter.
		 *
		 * @param counter
		 *            the counter
		 * @param english
		 *            the english
		 */
		Counter(String counter, boolean english)
		{
			int ret = Pdhdll.INSTANCE.PdhOpenQuery(null, null, _hQuery);
			_counter = counter;
			if (ret != Pdhdll.ERROR_SUCCESS)
				System.out.println("PdhOpenQuery " + Integer.toHexString(ret));

			if (english)
				ret = Pdhdll.INSTANCE.PdhAdd009CounterA(_hQuery.getValue(), counter, 0, _hCounter);
			else
				ret = Pdhdll.INSTANCE.PdhAddCounterA(_hQuery.getValue(), counter, 0, _hCounter);
			if (ret != Pdhdll.ERROR_SUCCESS)
				throw new IllegalArgumentException("PdhCounter: " + counter + " " + ret);
			// System.out.println("created counter: "+ _counter + " "+
			// _hQuery.getPointer() + " " +_hCounter.getPointer()+ " "+
			// _hQuery.getValue() + " " +_hCounter.getValue());
			getIntValue();
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.rzo.yajsw.os.ms.win.xp.PdhCounter#isValid()
		 */
		public boolean isValid()
		{
			return !(_hCounter == null || _hQuery == null || _hQuery.getValue().equals(null) || _hCounter.getValue().equals(null));
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.rzo.yajsw.os.ms.win.xp.PdhCounter#getDoubleValue()
		 */
		public double getDoubleValue()
		{
			if (!isValid())
				return -1;
			PDH_FMT_COUNTERVALUE pdhCounterValue = new PDH_FMT_COUNTERVALUE();
			pdhCounterValue.size();
			int ret = Pdhdll.INSTANCE.PdhCollectQueryData(_hQuery.getValue());
			if (ret != Pdhdll.ERROR_SUCCESS)
				System.out.println(Integer.toHexString(ret));
			PointerByReference result = new PointerByReference();
			ret = Pdhdll.INSTANCE.PdhGetFormattedCounterValue(_hCounter.getValue(), Pdhdll.PDH_FMT_DOUBLE, null, pdhCounterValue.getPointer());
			if (ret != Pdhdll.ERROR_SUCCESS)
				System.out.println(Integer.toHexString(ret));
			else
			{
				pdhCounterValue.read();
				return pdhCounterValue.Value.doubleValue;
			}
			return -1;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.rzo.yajsw.os.ms.win.xp.PdhCounter#getIntValue()
		 */
		public int getIntValue()
		{
			if (!isValid())
				return -1;
			PDH_FMT_COUNTERVALUE pdhCounterValue = new PDH_FMT_COUNTERVALUE();
			pdhCounterValue.size();
			int ret = Pdhdll.INSTANCE.PdhCollectQueryData(_hQuery.getValue());
			if (ret != Pdhdll.ERROR_SUCCESS)
				System.out.println(Integer.toHexString(ret));
			PointerByReference result = new PointerByReference();
			ret = Pdhdll.INSTANCE.PdhGetFormattedCounterValue(_hCounter.getValue(), Pdhdll.PDH_FMT_LONG, null, pdhCounterValue.getPointer());
			if (ret != Pdhdll.ERROR_SUCCESS)
				System.out.println(Integer.toHexString(ret));
			else
			{
				pdhCounterValue.read();
				return pdhCounterValue.Value.longValue;
			}
			return -1;
		}

		// call close to free sources. this is not done in finalize, because the
		// pointers may have already been finalized
		/*
		 * (non-Javadoc)
		 *
		 * @see org.rzo.yajsw.os.ms.win.xp.PdhCounter#close()
		 */
		public void close()
		{
			// System.out.println("closing counter: "+_counter + " " +
			// _hCounter.getValue() + " " + _hQuery.getValue());
			if (!isValid())
				return;
			if (_hCounter != null)
				Pdhdll.INSTANCE.PdhRemoveCounter(_hCounter.getValue());

			if (_hQuery != null)
				Pdhdll.INSTANCE.PdhCloseQuery(_hQuery.getValue());

			_hQuery = null;
			_hCounter = null;
		}

	} // Counter

	/** The _indexes. */
	static Map	_indexes	= null;

	/**
	 * Read index map.
	 */
	static void readIndexMap()
	{
		if (_indexes != null)
			return;
		_indexes = new HashMap();
		int ret = 0;
		IntByReference hkey = new IntByReference();

		ret = Advapi32.INSTANCE.RegOpenKeyExA(Advapi32.HKEY_LOCAL_MACHINE, "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Perflib\\009", 0,
				Advapi32.KEY_READ, hkey);
		// System.out.println(">> "+ret + " " +
		// Integer.toHexString(hkey.getValue()));

		int BufferSize = 1;
		int BYTEINCREMENT = 1024;
		Memory PerfData = new Memory(BufferSize);
		PerfData.clear();
		IntByReference PBufferSize = new IntByReference();

		PBufferSize.setValue(BufferSize);

		// System.out.println("Allocating memory...");
		for (ret = Advapi32.INSTANCE.RegQueryValueExA(hkey.getValue(), "Counter", null, null, PerfData, PBufferSize); ret == Advapi32.ERROR_MORE_DATA; ret = Advapi32.INSTANCE
				.RegQueryValueExA(hkey.getValue(), "Counter", null, null, PerfData, PBufferSize))
		{

			// Get a buffer that is big enough.

			BufferSize += BYTEINCREMENT;
			PBufferSize = new IntByReference();
			PBufferSize.setValue(BufferSize);
			PerfData = new Memory(BufferSize);
			PerfData.clear();
		}
		// System.out.println("Final buffer size is " +PBufferSize.getValue());
		if (ret != Pdhdll.ERROR_SUCCESS)
			System.out.println(Integer.toHexString(ret));
		else
		{
			String key;
			String counter;
			int i = 0;
			while (i < PBufferSize.getValue())
			{
				key = PerfData.getString(i);
				i += key.length() + 1;
				counter = PerfData.getString(i);
				i += counter.length() + 1;
				// System.out.println(counter+":"+key);
				if (counter.length() > 0 && key.length() > 0)
					try
					{
						_indexes.put(counter, new Integer(Integer.parseInt(key)));
					}
					catch (Exception ex)
					{
						ex.printStackTrace();
					}
			}

		}
		Advapi32.INSTANCE.RegCloseKey(hkey.getValue());

	}

	/**
	 * Translate.
	 *
	 * @param name
	 *            the name
	 *
	 * @return the string
	 */
	static String translate(String name)
	{
		readIndexMap();
		Integer index = (Integer) _indexes.get(name);
		if (index == null)
			return name;
		Memory buff = new Memory(256);
		IntByReference buffSize = new IntByReference();
		buffSize.setValue(256);
		if (Pdhdll.INSTANCE.PdhLookupPerfNameByIndexA(null, index.intValue(), buff, buffSize) == Pdhdll.ERROR_SUCCESS)
			return buff.getString(0);
		return name;
	}

    /**
     * Gets the locale counter.
     * 
     * @param counter
     *            the counter
     * 
     * @return the locale counter
     */
	static public PdhCounter getLocaleCounter(String counter)
	{
		return new Counter(counter, false);
	}
}
