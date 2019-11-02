package com.cf.json.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cf.json.entity.Ding;
import com.cf.json.entity.Operation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Json2Map {
    public static void main(String[] args) {
        String json="{\n" +
                "    \"errcode\": 0,\n" +
                "    \"process_instance\": {\n" +
                "        \"attached_process_instance_ids\": [],\n" +
                "        \"biz_action\": \"NONE\",\n" +
                "        \"business_id\": \"201910311608000447590\",\n" +
                "        \"cc_userids\": [\n" +
                "            \"031928461537738628\",\n" +
                "            \"031226653126153773\",\n" +
                "            \"142905596223887987\",\n" +
                "            \"2811090058800301\",\n" +
                "            \"161210562623413664\"\n" +
                "        ],\n" +
                "        \"create_time\": \"2019-10-31 16:08:45\",\n" +
                "        \"finish_time\": \"2019-10-31 16:13:46\",\n" +
                "        \"form_component_values\": [\n" +
                "            {\n" +
                "                \"component_type\": \"TextField\",\n" +
                "                \"id\": \"TextField-ISFFIRRD\",\n" +
                "                \"name\": \"联合行文单位名称\",\n" +
                "                \"value\": \"综合监督局\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"TextField\",\n" +
                "                \"id\": \"TextField-ISFFIRRE\",\n" +
                "                \"name\": \"发文字号\",\n" +
                "                \"value\": \"鄂卫监局发〔2019〕8\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"DDSelectField\",\n" +
                "                \"ext_value\": \"{\\\"key\\\":\\\"option_0\\\"}\",\n" +
                "                \"id\": \"DDSelectField-K1W3RY0F\",\n" +
                "                \"name\": \"密级\",\n" +
                "                \"value\": \"秘密\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"DDSelectField\",\n" +
                "                \"ext_value\": \"{\\\"key\\\":\\\"option_2\\\"}\",\n" +
                "                \"id\": \"DDSelectField-K1K3YC9N\",\n" +
                "                \"name\": \"紧急程度\",\n" +
                "                \"value\": \"平急\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"TextField\",\n" +
                "                \"id\": \"TextField-ISFFIRRG\",\n" +
                "                \"name\": \"文件标题\",\n" +
                "                \"value\": \"无证行医\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"TextField\",\n" +
                "                \"id\": \"TextField-ISFFIRRH\",\n" +
                "                \"name\": \"主送单位\",\n" +
                "                \"value\": \"卫生计生委\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"TextField\",\n" +
                "                \"id\": \"TextField-K1JD33Q5\",\n" +
                "                \"name\": \"抄送单位\",\n" +
                "                \"value\": \"卫生健康委\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"TextField\",\n" +
                "                \"id\": \"TextField-K1JD33Q6\",\n" +
                "                \"name\": \"主题词\",\n" +
                "                \"value\": \"测试\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"TextField\",\n" +
                "                \"id\": \"TextField-K237UBD3\",\n" +
                "                \"name\": \"拟稿人\",\n" +
                "                \"value\": \"监督\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"DDDateField\",\n" +
                "                \"id\": \"DDDateField-K237UBD4\",\n" +
                "                \"name\": \"拟稿日期\",\n" +
                "                \"value\": \"2019-10-01\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"TextField\",\n" +
                "                \"id\": \"TextField-K1JD33Q8\",\n" +
                "                \"name\": \"主办处室意见\",\n" +
                "                \"value\": \"null\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"DDSelectField\",\n" +
                "                \"ext_value\": \"{\\\"key\\\":\\\"option_1\\\"}\",\n" +
                "                \"id\": \"DDSelectField-K1Z0IDKH\",\n" +
                "                \"name\": \"会稿\",\n" +
                "                \"value\": \"不需要其他处室会稿\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"TextField\",\n" +
                "                \"id\": \"TextField-K1JD33Q9\",\n" +
                "                \"name\": \"会稿处室意见\",\n" +
                "                \"value\": \"null\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"TextField\",\n" +
                "                \"id\": \"TextField-K1JD33QA\",\n" +
                "                \"name\": \"局办公室核稿意见\",\n" +
                "                \"value\": \"null\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"TextField\",\n" +
                "                \"id\": \"TextField-K1JD33QB\",\n" +
                "                \"name\": \"分管领导审批意见\",\n" +
                "                \"value\": \"null\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"TextField\",\n" +
                "                \"id\": \"TextField-K20EE8VC\",\n" +
                "                \"name\": \"局领导审批意见\",\n" +
                "                \"value\": \"null\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"TextField\",\n" +
                "                \"id\": \"TextField-K1JD33QC\",\n" +
                "                \"name\": \"会签单位意见\",\n" +
                "                \"value\": \"null\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"TextField\",\n" +
                "                \"id\": \"TextField-K1W4AY1V\",\n" +
                "                \"name\": \"校对人\",\n" +
                "                \"value\": \"李进\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"NumberField\",\n" +
                "                \"id\": \"NumberField-K1W4AY1W\",\n" +
                "                \"name\": \"印数\",\n" +
                "                \"value\": \"1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"component_type\": \"DDAttachment\",\n" +
                "                \"id\": \"DDAttachment-K243SZ49\",\n" +
                "                \"name\": \"正文内容\",\n" +
                "                \"value\": \"[{\\\"uploadSize\\\":24830,\\\"spaceId\\\":1856950597,\\\"fileName\\\":\\\"OA附件(6)(1)(2)(2)(1)(1)(1)(1).docx\\\",\\\"fileSize\\\":13251,\\\"fileType\\\":\\\"docx\\\",\\\"fileId\\\":\\\"9642453104\\\"}]\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"operation_records\": [\n" +
                "            {\n" +
                "                \"date\": \"2019-10-31 16:08:44\",\n" +
                "                \"operation_result\": \"NONE\",\n" +
                "                \"operation_type\": \"START_PROCESS_INSTANCE\",\n" +
                "                \"userid\": \"2455434225856653\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-10-31 16:08:45\",\n" +
                "                \"operation_result\": \"NONE\",\n" +
                "                \"operation_type\": \"NONE\",\n" +
                "                \"remark\": \"\",\n" +
                "                \"userid\": \"2455434225856653\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-10-31 16:09:19\",\n" +
                "                \"operation_result\": \"AGREE\",\n" +
                "                \"operation_type\": \"EXECUTE_TASK_NORMAL\",\n" +
                "                \"remark\": \"请局办核稿\",\n" +
                "                \"userid\": \"2811090058800301\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-10-31 16:09:37\",\n" +
                "                \"operation_result\": \"AGREE\",\n" +
                "                \"operation_type\": \"EXECUTE_TASK_NORMAL\",\n" +
                "                \"remark\": \"呈钱局、赵局阅示\",\n" +
                "                \"userid\": \"161210562623413664\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-10-31 16:10:07\",\n" +
                "                \"operation_result\": \"AGREE\",\n" +
                "                \"operation_type\": \"EXECUTE_TASK_NORMAL\",\n" +
                "                \"remark\": \"拟同意\",\n" +
                "                \"userid\": \"031226653126153773\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-10-31 16:13:45\",\n" +
                "                \"operation_result\": \"AGREE\",\n" +
                "                \"operation_type\": \"EXECUTE_TASK_NORMAL\",\n" +
                "                \"remark\": \"同意\",\n" +
                "                \"userid\": \"031928461537738628\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"originator_dept_id\": \"139878981\",\n" +
                "        \"originator_dept_name\": \"卫生监督信息与宣传中心\",\n" +
                "        \"originator_userid\": \"2455434225856653\",\n" +
                "        \"result\": \"agree\",\n" +
                "        \"status\": \"COMPLETED\",\n" +
                "        \"tasks\": [\n" +
                "            {\n" +
                "                \"create_time\": \"2019-10-31 16:08:45\",\n" +
                "                \"finish_time\": \"2019-10-31 16:09:20\",\n" +
                "                \"task_result\": \"AGREE\",\n" +
                "                \"task_status\": \"COMPLETED\",\n" +
                "                \"taskid\": \"62562952069\",\n" +
                "                \"url\": \"aflow.dingtalk.com?procInsId=e02a92f2-eed2-4205-a569-7cb0df59c03b&taskId=62562952069&businessId=201910311608000447590\",\n" +
                "                \"userid\": \"2811090058800301\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"create_time\": \"2019-10-31 16:09:20\",\n" +
                "                \"finish_time\": \"2019-10-31 16:09:37\",\n" +
                "                \"task_result\": \"AGREE\",\n" +
                "                \"task_status\": \"COMPLETED\",\n" +
                "                \"taskid\": \"62571277618\",\n" +
                "                \"url\": \"aflow.dingtalk.com?procInsId=e02a92f2-eed2-4205-a569-7cb0df59c03b&taskId=62571277618&businessId=201910311608000447590\",\n" +
                "                \"userid\": \"161210562623413664\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"create_time\": \"2019-10-31 16:09:37\",\n" +
                "                \"finish_time\": \"2019-10-31 16:10:07\",\n" +
                "                \"task_result\": \"AGREE\",\n" +
                "                \"task_status\": \"COMPLETED\",\n" +
                "                \"taskid\": \"62572618211\",\n" +
                "                \"url\": \"aflow.dingtalk.com?procInsId=e02a92f2-eed2-4205-a569-7cb0df59c03b&taskId=62572618211&businessId=201910311608000447590\",\n" +
                "                \"userid\": \"031226653126153773\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"create_time\": \"2019-10-31 16:10:07\",\n" +
                "                \"finish_time\": \"2019-10-31 16:13:46\",\n" +
                "                \"task_result\": \"AGREE\",\n" +
                "                \"task_status\": \"COMPLETED\",\n" +
                "                \"taskid\": \"62580791489\",\n" +
                "                \"url\": \"aflow.dingtalk.com?procInsId=e02a92f2-eed2-4205-a569-7cb0df59c03b&taskId=62580791489&businessId=201910311608000447590\",\n" +
                "                \"userid\": \"031928461537738628\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"title\": \"李进提交的发文\"\n" +
                "    },\n" +
                "    \"request_id\": \"107a1agx3plan\"\n" +
                "}";
        json2map(json);

    }

    //json取值插入hashmap
    public static void json2map(String json){
        JSONObject obj1 = JSONObject.parseObject(json);
        String json1 = obj1.getString("process_instance");
        System.out.println(json1);

        JSONObject ding = JSONObject.parseObject(json1);
        String json_ding = ding.getString("form_component_values");
        System.out.println(json_ding);

        List<Ding> dings = JSON.parseArray(json_ding, Ding.class);
        Map<Object, Object> map_ding = new HashMap<Object, Object>();

        for(int i=0;i<dings.size();i++){
            map_ding.put(dings.get(i).getName(),dings.get(i).getValue());
        }
        System.out.println(map_ding);

        System.out.println(map_ding.get("联合行文单位名称"));
        System.out.println(map_ding.get("发文字号"));
    }
}
