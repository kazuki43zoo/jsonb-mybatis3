drop table if exists posts;

create table posts (
  id serial primary key,
  jbpost jsonb,     -- スキーマレスな JSON で何でも詰め込む
  jbtags jsonb      -- タグを JSON 配列で持つ
);
