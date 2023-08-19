// This file is auto-generated by Tabugen, DO NOT EDIT!
package com.pdfun.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;

public class Utility {
    private static HashMap<Class<?>, Function<String,?>> parsers = new HashMap<>();

    static {
        parsers.put(boolean.class   , Boolean::parseBoolean); // Support boolean literals too
        parsers.put(short.class     , Integer::parseInt);
        parsers.put(int.class       , Integer::parseInt);
        parsers.put(long.class      , Long::parseLong);
        parsers.put(float.class     , Long::parseLong);
        parsers.put(double.class    , Long::parseLong);
        parsers.put(Boolean.class   , Boolean::valueOf);
        parsers.put(Short.class     , Integer::valueOf);
        parsers.put(Integer.class   , Integer::valueOf);
        parsers.put(Long.class      , Long::valueOf);
        parsers.put(Double.class    , Double::valueOf);
        parsers.put(Float.class     , Float::valueOf);
        parsers.put(String.class    , String::valueOf);  // Handle String without special test
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static <E> E parseAs(String s, Class vt) {
        Function<String,?> func = parsers.get(vt);
        return (E)func.apply(s);
    }

     public static boolean parseBool(String s) {
        if (s != null && s.length() > 0) {
            return Boolean.parseBoolean(s);
        }
        return false;
    }

     public static byte parseByte(String s) {
        if (s != null && s.length() > 0) {
            return Byte.parseByte(s);
        }
        return 0;
    }

     public static short parseShort(String s) {
        if (s != null && s.length() > 0) {
            return Short.parseShort(s);
        }
        return 0;
    }

     public static int parseInt(String s) {
        if (s != null && s.length() > 0) {
            return Integer.parseInt(s);
        }
        return 0;
    }

    public static long parseLong(String s) {
        if (s != null && s.length() > 0) {
            return Long.parseLong(s);
        }
        return 0;
    }

    public static float parseFloat(String s) {
        if (s != null && s.length() > 0) {
            return Float.parseFloat(s);
        }
        return 0;
    }

    public static double parseDouble(String s) {
        if (s != null && s.length() > 0) {
            return Double.parseDouble(s);
        }
        return 0;
    }

    public static boolean[] parseBoolArray(String s) {
        if (s == null || s.length() == 0) {
            return new boolean[0];
        }
        String[] parts = StringUtils.split(s, "|");
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i = 0; i < parts.length; i++)
        {
            if (parts[i].length() > 0) {
                list.add(parseBool(parts[i]));
            }
        }

        boolean[] a = new boolean[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            a[i] = list.get(i);
        }
        return a;
    }

    public static byte[] parseByteArray(String s) {
        if (s == null || s.length() == 0) {
            return new byte[0];
        }
        String[] parts = StringUtils.split(s, "|");
        ArrayList<Byte> list = new ArrayList<>();
        for(int i = 0; i < parts.length; i++)
        {
            if (parts[i].length() > 0) {
                list.add(parseByte(parts[i]));
            }
        }
        byte[] a = new byte[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            a[i] = list.get(i);
        }
        return a;
    }

    public static short[] parseShortArray(String s) {
        if (s == null || s.length() == 0) {
            return new short[0];
        }
        String[] parts = StringUtils.split(s, "|");
        ArrayList<Short> list = new ArrayList<>();
        for(int i = 0; i < parts.length; i++)
        {
            if (parts[i].length() > 0) {
                list.add(parseShort(parts[i]));
            }
        }
        short[] a = new short[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            a[i] = list.get(i);
        }
        return a;
    }

    public static int[] parseIntArray(String s) {
        if (s == null || s.length() == 0) {
            return new int[0];
        }
        String[] parts = StringUtils.split(s, "|");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < parts.length; i++)
        {
            if (parts[i].length() > 0) {
                list.add(parseInt(parts[i]));
            }
        }
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            a[i] = list.get(i);
        }
        return a;
    }

    public static long[] parseLongArray(String s) {
        if (s == null || s.length() == 0) {
            return new long[0];
        }
        String[] parts = StringUtils.split(s, "|");
        ArrayList<Long> list = new ArrayList<>();
        for(int i = 0; i < parts.length; i++)
        {
            if (parts[i].length() > 0) {
                list.add(parseLong(parts[i]));
            }
        }
        long[] a = new long[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            a[i] = list.get(i);
        }
        return a;
    }

    public static float[] parseFloatArray(String s) {
        if (s == null || s.length() == 0) {
            return new float[0];
        }
        String[] parts = StringUtils.split(s, "|");
        ArrayList<Float> list = new ArrayList<>();
        for(int i = 0; i < parts.length; i++)
        {
            if (parts[i].length() > 0) {
                list.add(parseFloat(parts[i]));
            }
        }
        float[] a = new float[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            a[i] = list.get(i);
        }
        return a;
    }

    public static double[] parseDoubleArray(String s) {
        if (s == null || s.length() == 0) {
            return new double[0];
        }
        String[] parts = StringUtils.split(s, "|");
        ArrayList<Double> list = new ArrayList<>();
        for(int i = 0; i < parts.length; i++)
        {
            if (parts[i].length() > 0) {
                list.add(parseDouble(parts[i]));
            }
        }
        double[] a = new double[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            a[i] = list.get(i);
        }
        return a;
    }

    public static String[] parseStringArray(String s) {
        if (s == null || s.length() == 0) {
            return new String[0];
        }
        String[] parts = StringUtils.split(s, "|");
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < parts.length; i++)
        {
            if (parts[i].length() > 0) {
                list.add(StringUtils.trim(parts[i]));
            }
        }
        String[] a = new String[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            a[i] = list.get(i);
        }
        return a;
    }

    public static <K, V> Map<K, V> parseMap(String s, Class tk, Class tv) {
        Map<K, V> dict = new HashMap<>();
        String[] parts = StringUtils.split(s, "|");
        for(int i = 0; i < parts.length; i++)
        {
            String[] pair = StringUtils.split(parts[i], "=");
            if (pair.length == 2) {
                K key = parseAs(pair[0], tk);
                V val = parseAs(pair[1], tv);
                dict.put(key, val);
            }
        }
        return dict;
    }
}