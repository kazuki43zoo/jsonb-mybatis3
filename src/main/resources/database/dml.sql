insert into posts (jbpost, jbtags) values
('{
    "author":"キー太",
    "message":"日本語でおk"}'
    ,'["hoge", "Qiita"]'
),
('{
     "author": "Snafkin",
     "title": "Postgres 入門",
     "content": "はじめに...",
     "comments": ["1get!", "2get!"] }'
     ,'["PostgreSQL", "JSON"]'
);

commit;