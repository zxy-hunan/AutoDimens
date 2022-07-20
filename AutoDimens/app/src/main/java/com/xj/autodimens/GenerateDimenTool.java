package com.xj.autodimens;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GenerateDimenTool {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        //添加xml开始的标签
        builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n")
                .append("<resources>\n");

        //添加dp
        builder.append("\n    <!--          dp          -->\n");
        for (int i = 0; i < 1300; i++) {
            builder.append("    <dimen name=\"dp_")
                    .append(i)
                    .append("\">")
                    .append(i)
                    .append("dp</dimen>\n");
        }

        //添加sp
        builder.append("\n    <!--          sp          -->\n");
        for (int i = 0; i < 50; i++) {
            builder.append("    <dimen name=\"sp_")
                    .append(i)
                    .append("\">")
                    .append(i)
                    .append("sp</dimen>\n");
        }

        //添加xml的尾标签
        builder.append("</resources>");

        String dimensFile = "./app/src/main/res/values/dimens.xml";
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(dimensFile)));
            out.println(builder);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
