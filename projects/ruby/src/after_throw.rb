begin
  raise
  puts 'Am I dead?'
rescue RuntimeError
  # do nothing
end
